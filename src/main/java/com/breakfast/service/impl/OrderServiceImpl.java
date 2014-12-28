package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TExpress;
import com.breakfast.domain.tables.TOrder;
import com.breakfast.domain.tables.TOrderDetail;
import com.breakfast.domain.tables.pojos.*;
import com.alipay.util.UtilDate;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TOrder;
import com.breakfast.domain.tables.TOrderDetail;
import com.breakfast.domain.tables.records.TOrderDetailRecord;
import com.breakfast.domain.tables.records.TOrderRecord;
import com.breakfast.service.*;
import com.core.utils.IUUIDGenerator;
import org.apache.commons.lang3.StringUtils;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    DSLContext creator;
    @Autowired
    SetMealService setMealService;
    @Autowired
    FoodService foodService;
    @Autowired
    CouponService couponService;
    @Autowired
    UserService userService;



    @Override
    public String saveOrderDetail(OrderDetail orderDetail) {
        TOrderDetailRecord record = creator.newRecord(Tables.OrderDetail, orderDetail);
        record.store();
        int count=creator.executeInsert(record);
        return record.getDetailId();
    }

    @Override
    public List<Express> getExpressByUser(String userId) {
        TOrder order = Tables.Order.as("o");
        TExpress express = Tables.Express.as("e");

        List<Express> expresses = creator.select(express.latitude, express.longitude)
                .from(express)
                .join(order)
                .on(order.orderId.equal(express.orderId))
                .where(order.customerId.equal(userId))
                .and(order.status.equal(IConstants.ORDER_STATUS_DRAFT).or(order.status.equal(IConstants.ORDER_STATUS_DISTRIBUTION)))
                .orderBy(order.createTime)
                .fetchInto(Express.class);
        return expresses;
    }

    @Override
    public String saveOrderWithDetail(Order order) {
        String orderId = IUUIDGenerator.getUUID();
        order.setOrderId(orderId);
        order.setOrderNo(UtilDate.getOrderNum());
        TOrderRecord orderRecord = creator.newRecord(Tables.Order, order);
        orderRecord.store();
        int count = creator.executeInsert(orderRecord);
        for (OrderDetail orderDetail : order.getOrderDetails()) {
            String orderDetailId = IUUIDGenerator.getUUID();
            orderDetail.setDetailId(orderDetailId);
            orderDetail.setOrderId(orderId);
            TOrderDetailRecord record = creator.newRecord(Tables.OrderDetail, orderDetail);
            record.store();
            count += creator.executeInsert(record);
        }
        if (StringUtils.isNotBlank(order.getUsedCoupons())) {
            //将使用的红包置为不可用状态
            Coupon coupon =  couponService.getCoupon(order.getUsedCoupons());
            coupon.setStatus(IConstants.DISCARD);
            couponService.updateCoupon(coupon);
        }

        if(StringUtils.isNotBlank(order.getCustomerId())){
            //收货人姓名、手机号、地址默认存储为会员的姓名、手机号和地址
            User user = userService.loadUser(order.getCustomerId());
            user.setMobile(order.getConsigneeMobile());
            user.setUserName(order.getConsigneeName());
            UserCustomer userCustomer = user.getUserCustomer();
            userCustomer.setAddress1(order.getConsigneeAddress());
            if (order.getExccreaditCount()!=null && order.getExccreaditCount()>0){
                userCustomer.setCredits(userCustomer.getCredits()-order.getExccreaditCount());
            }
            user.setUserCustomer(userCustomer);
            userService.saveUser(user);
        }

        return orderId;
    }

    @Override
    public List<OrderDetail> getOrderDetails(String orderId) {
        TOrderDetail od = Tables.OrderDetail.as("od");
        List<OrderDetail> orderDetails = creator.selectFrom(od)
                .where(od.orderId.equal(orderId))
                .orderBy(od.createTime)
                .fetchInto(OrderDetail.class);
        for (OrderDetail orderDetail : orderDetails) {
            if(orderDetail.getFoodObjType().equals(IConstants.FOOD_OBJ_TYPE_SETMEAL)){
                orderDetail.setFoodObjName(setMealService.getSetMeal(orderDetail.getFoodObjId()).getSetName());
            }else if (orderDetail.getFoodObjType().equals(IConstants.FOOD_OBJ_TYPE_FOOD)) {
                orderDetail.setFoodObjName(foodService.getFood(orderDetail.getFoodObjId()).getFoodName());
            }
        }
        return orderDetails;
    }
}
