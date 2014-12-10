package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.Food;
import com.breakfast.domain.tables.pojos.OrderDetail;
import com.breakfast.provider.FastJson;
import com.breakfast.service.FoodService;
import com.breakfast.service.OrderService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 获取套餐列表
     * @author Felix
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cOrder")
    public Map<String,Object> cOrder(@ModelAttribute OrderDetail orderDetail){
        IMsgUtil msgUtil = new IMsgUtil();
        String id = orderService.saveOrderDetail(orderDetail);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, id);
    }

}
