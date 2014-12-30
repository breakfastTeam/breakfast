package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.*;
import com.breakfast.provider.FastJson;
import com.breakfast.service.*;
import com.core.utils.IMsgUtil;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private SetMealService setMealService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private UserService userService;
    @Autowired
    private CouponService couponService;

    /**
     * 获取订单列表
     * @author Felix
     * 变更记录:
     * todo:重新校验总价。。
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cOrder")
    public Map<String,Object> cOrder(@FastJson Order order){
        IMsgUtil msgUtil = new IMsgUtil();
        if (StringUtils.isNotBlank(order.getPreSendDateStr())) {
            order.setPreSendDate(DateTime.parse(order.getPreSendDateStr().substring(0,10), DateTimeFormat.forPattern("yyyy-MM-dd")));
        }
        Map result = handleOrder(order, msgUtil);
        Object errorMsg=result.get("body");
        if (errorMsg!=null) {
            List<String> errors= (List<String>) errorMsg;
            if (errors.size() > 0) {
                return result;
            }
        }
        String id = orderService.saveOrderWithDetail(order);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, id);
    }

    /**
     * 处理订单
     * -检查库存并更新 错误则返回
     * -检查积分
     * -检查红包
     * -计算订单价格，单品价格限制
     * -检查积分限制
     * @param order
     * @param msgUtil
     * @return
     */
    private Map handleOrder(Order order,IMsgUtil msgUtil) {
        List<OrderDetail> orderDetails = order.getOrderDetails();
        int length = orderDetails.size();
        Map result = null;
        boolean error=false;
        boolean onlyFood=true;
        List<String> names = Lists.newArrayListWithCapacity(length);
        BigDecimal totalPrice = new BigDecimal("0");
        BigDecimal subtotal = new BigDecimal("0");
        BigDecimal zero = new BigDecimal("0");
        int creditsLimit = 0;
        List<String> message = Lists.newArrayListWithCapacity(10);
        for (int i = 0; i < length; i++) {
            OrderDetail orderDetail = orderDetails.get(i);
            int orderFoodCount = orderDetail.getFoodObjCount();

            if (orderDetail.getFoodObjType().equals(IConstants.FOOD_OBJ_TYPE_SETMEAL)) {
                SetMeal setMeal = setMealService.getSetMeal(orderDetail.getFoodObjId());
                if (setMeal.getFoodCount() < orderFoodCount) {
                    error = true;
                    names.add(setMeal.getSetName());
                }
                subtotal = setMeal.getPrivilege().multiply(new BigDecimal(orderFoodCount));
                orderDetail.setFoodObjPrice(subtotal);
                totalPrice = totalPrice.add(subtotal);
                if (setMeal.getExchangeCount() != null) {
                    creditsLimit += setMeal.getExchangeCount()*orderFoodCount;
                }
                onlyFood = false;
            } else if (orderDetail.getFoodObjType().equals(IConstants.FOOD_OBJ_TYPE_FOOD)) {
                Food food = foodService.getFood(orderDetail.getFoodObjId());
                if (food.getFoodCount() < orderFoodCount) {
                    error = true;
                    names.add(food.getFoodName());
                }
                subtotal = food.getPrice().multiply(new BigDecimal(orderFoodCount));
                orderDetail.setFoodObjPrice(subtotal);
                totalPrice = totalPrice.add(subtotal);
                if (food.getExchangeCount() != null) {
                    creditsLimit += food.getExchangeCount() * orderFoodCount;
                }
            }
        }
        if (error) {
            Joiner joiner=Joiner.on("、");
            if (names.size() == 1) {
                message.add(names.get(0) + "库存不足");
            }else {
                message.add(joiner.join(names) + "，库存不足");
            }
        }
        if (onlyFood) {
            BigDecimal onlyFoodLimit = new BigDecimal(IConstants.ONLY_FOOD_LIMIT);
            if (totalPrice.compareTo(onlyFoodLimit) < 0) {
                message.add("只购买单品时总价不能低于"+onlyFoodLimit+"元");
            }
        }
        //扣除优惠
        if (StringUtils.isNotBlank(order.getCustomerId())) {
            Integer useCredits = order.getExccreaditCount();
            UserCustomer customer = userService.loadUser(order.getCustomerId()).getUserCustomer();
            if (useCredits != null && useCredits > 0) {
                if (creditsLimit != 0 && useCredits > creditsLimit) {
                    message.add("您的订单最多能使用" + creditsLimit + "积分");
                }
                Integer userCredits = customer.getCredits();
                if (userCredits != null && userCredits < useCredits) {
                    message.add("积分不足");
                } else {
                    //消耗的积分
                    BigDecimal cost = new BigDecimal(useCredits).multiply(new BigDecimal(IConstants.creditScale));
                    totalPrice = totalPrice.subtract(cost);
                }
            }
            String usedCoupons = order.getUsedCoupons();
            if (StringUtils.isNotBlank(usedCoupons)) {
                Coupon coupon =  couponService.getCoupon(order.getUsedCoupons());
                if (coupon!=null) {
                    totalPrice = totalPrice.subtract(coupon.getPrice());
                }else{
                    message.add("红包不可用");
                }
            }
        }
        if (totalPrice.compareTo(zero)<0) {
            totalPrice = zero;
        }
        result = msgUtil.generateMsg(IConstants.ERROR_CODE, IConstants.OPERATE_ERROR, message);
        order.setOrderPrice(totalPrice);
        order.setStatus(IConstants.ORDER_STATUS_DRAFT);
        return result;
    }

    /**
     * 获取指定用户订单位置信息
     * @author Felix
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cGetExpressPosition")
    public Map<String,Object> cGetExpressPosition(@RequestParam String userId){
        IMsgUtil msgUtil = new IMsgUtil();
        List<Express> expresses = orderService.getExpressByUser(userId);
        Express express = new Express();
        if(expresses !=  null && expresses.size()>0){
            express = expresses.get(0);
//            if(Double.parseDouble(express.getLongitude())<Double.parseDouble(IConstants.WENHUALU_LNG)){
//                express.setLongitude(IConstants.WENHUALU_LNG);
//            }
        }
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, express);
    }
}