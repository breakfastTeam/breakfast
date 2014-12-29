package com.breakfast.service;

import com.breakfast.domain.tables.pojos.SendCoupon;

/**
 * Created by kkk .
 */
public interface SendCouponService {

    /**
     * 根据用户主键获取该用户下可分享的红包
     * @param userId
     * @return
     */
    SendCoupon getSendCouponByUserId(String userId);

    /**
     * 根据主键获取可分享的红包
     * @param sendCouponId
     * @return
     */
    SendCoupon getSendCoupon(String sendCouponId);

}
