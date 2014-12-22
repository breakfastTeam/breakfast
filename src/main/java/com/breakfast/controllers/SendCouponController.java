package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.SendCoupon;
import com.breakfast.service.SendCouponService;
import com.core.utils.IMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class SendCouponController {
    @Autowired
    private SendCouponService sendCouponService;

    /**
     * 保存我的红包信息
     * @author Felix
     * 变更记录:
     */
    @ResponseBody
    @RequestMapping(value = "/cGetSendingRedPaper")
    public Map<String,Object> cGetSendingRedPaper(@RequestParam String userId){
        IMsgUtil msgUtil = new IMsgUtil();
        SendCoupon sendCoupon = sendCouponService.getSendCouponByUserId(userId);
        if(sendCoupon != null){
            return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, sendCoupon);
        }else{
            return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, null);
        }

    }

}
