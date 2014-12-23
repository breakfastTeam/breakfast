package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.Express;
import com.breakfast.domain.tables.pojos.Food;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.OrderDetail;
import com.breakfast.provider.FastJson;
import com.breakfast.service.FoodService;
import com.breakfast.service.OrderService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
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
        String id = orderService.saveOrderWithDetail(order);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, id);
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