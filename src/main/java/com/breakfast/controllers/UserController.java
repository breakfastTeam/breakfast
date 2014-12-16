package com.breakfast.controllers;

import com.alibaba.fastjson.JSONObject;
import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.*;
import com.breakfast.provider.FastJson;
import com.breakfast.provider.JSONObjectWrapper;
import com.breakfast.service.SetMealService;
import com.breakfast.service.UserService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk on 14/11/19.
 */
@Controller
@RequestMapping("/mobile")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录检查
     */
    @ResponseBody
    @RequestMapping(value = "/cLogin")
    public Map<String,Object> cLogin(@FastJson User user, final HttpSession session){
        IMsgUtil msgUtil = new IMsgUtil();
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        User ruser=userService.findUser(user);
        if (ruser != null) {
            session.setAttribute(IConstants.SEESION_USER_ID,user.getUserId());
            return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, ruser);
        }else{
            return msgUtil.generateMsg(IConstants.ERROR_CODE, IConstants.OPERATE_ERROR, null);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/cGetUserInfo")
    public Map<String, Object> cGetUserInfo(@RequestParam String userId) {
        IMsgUtil msgUtil = new IMsgUtil();
        User user=userService.loadUser(userId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, user);
    }

    @ResponseBody
    @RequestMapping(value = "/cGetUserCoupons")
    public Map<String, Object> cGetUserCoupons(@RequestParam String userId) {
        IMsgUtil msgUtil = new IMsgUtil();
        List<Coupon> coupons=userService.loadUserCoupons(userId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, coupons);
    }

    @ResponseBody
    @RequestMapping(value = "/cGetUserOrders")
    public Map<String, Object> cGetUserOrders(@RequestParam String userId) {
        IMsgUtil msgUtil = new IMsgUtil();
        List<Order> orders=userService.loadUserOrders(userId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, orders);
    }

    @ResponseBody
    @RequestMapping("cSaveUser")
    public Map<String, Object> cSaveUser(@FastJson User user) {
        IMsgUtil msgUtil = new IMsgUtil();
        int count=userService.saveUser(user);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, true);
    }
}
