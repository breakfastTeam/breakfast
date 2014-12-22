package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Coupon;
import com.breakfast.domain.tables.pojos.SendCoupon;

/**
 * Created by kkk .
 */
public interface CouponService {

    /**
     * 根据生成用户名下的可用红包
     * @param userId
     * @return
     */
    Coupon generateCoupon(String sendCouponId, String userId);

}
