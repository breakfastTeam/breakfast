package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.*;
import com.breakfast.provider.FastJson;
import com.breakfast.service.FoodService;
import com.breakfast.service.OrderService;
import com.breakfast.service.SetMealService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
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
        if (result != null) {
            return result;
        }
        String id = orderService.saveOrderWithDetail(order);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, id);
    }

    private Map handleOrder(Order order,IMsgUtil msgUtil) {
        List<OrderDetail> orderDetails = order.getOrderDetails();
        int length = orderDetails.size();
        Map result = null;
        boolean error=false;
        List<String> names = Lists.newArrayListWithCapacity(length);
        List<SetMeal> setMeals = Lists.newArrayListWithCapacity(length);
        List<Food> foods = Lists.newArrayListWithCapacity(length);
        for (int i = 0; i < length; i++) {
            OrderDetail orderDetail = orderDetails.get(i);
            int orderFoodCount = orderDetail.getFoodObjCount();

            if (orderDetail.getFoodObjType().equals(IConstants.FOOD_OBJ_TYPE_SETMEAL)) {
                SetMeal setMeal = setMealService.getSetMeal(orderDetail.getFoodObjId());
                if (setMeal.getFoodCount() < orderFoodCount) {
                    error = true;
                    names.add(setMeal.getSetName());
                } else {
                    setMeal.setFoodCount(setMeal.getFoodCount() - orderFoodCount);
                    setMeal.setRealFoodCount(setMeal.getRealFoodCount() - orderFoodCount);
                    setMeals.add(setMeal);
                }
            } else if (orderDetail.getFoodObjType().equals(IConstants.FOOD_OBJ_TYPE_FOOD)) {
                Food food = foodService.getFood(orderDetail.getFoodObjId());
                if (food.getFoodCount() < orderFoodCount) {
                    error = true;
                    names.add(food.getFoodName());
                } else {
                    food.setFoodCount(food.getFoodCount() - orderFoodCount);
                    food.setRealFoodCount(food.getRealFoodCount() - orderFoodCount);
                    foods.add(food);
                }
            }
        }
        if (error) {
            Joiner joiner=Joiner.on("、");
            String message = null;
            if (names.size() == 1) {
                message = names.get(0) + "库存不足";
            }else {
                message = joiner.join(names) + "，库存不足";
            }
            result = msgUtil.generateMsg(IConstants.ERROR_CODE, IConstants.OPERATE_ERROR, message);
        } else {
            for (SetMeal setMeal : setMeals) {
                setMealService.update(setMeal);
            }
            for (Food food : foods) {
                foodService.update(food);
            }
        }
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