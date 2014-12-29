package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.Coupon;
import com.breakfast.service.CouponService;
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
public class CouponController {

    @Autowired
    CouponService couponService;
    /**
     * 保存我的红包信息
     * @author Felix
     * 变更记录:
     */
    @ResponseBody
    @RequestMapping(value = "/cSaveRedPaper")
    public Map<String,Object> cSaveRedPaper(@RequestParam String sendCouponId,@RequestParam String userId){
        IMsgUtil msgUtil = new IMsgUtil();
        Coupon coupon = couponService.generateCoupon(sendCouponId, userId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, coupon);
    }

}
