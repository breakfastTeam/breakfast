package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TExpress;
import com.breakfast.domain.tables.TOrder;
import com.breakfast.domain.tables.TOrderDetail;
import com.breakfast.domain.tables.pojos.Express;
import com.alipay.util.UtilDate;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TOrder;
import com.breakfast.domain.tables.TOrderDetail;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.OrderDetail;
import com.breakfast.domain.tables.records.TOrderDetailRecord;
import com.breakfast.domain.tables.records.TOrderRecord;
import com.breakfast.service.OrderService;
import com.core.utils.IUUIDGenerator;
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
        return orderId;
    }
}
