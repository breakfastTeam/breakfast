package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Coupon;

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

    /**
     * 更新红包状态
     * @param coupon
     * @return
     */
    void updateCoupon(Coupon coupon);
    /**
     * 更新红包状态
     * @param coupon
     * @return
     */
    void saveCoupon(Coupon coupon);

    /**
     * 根据红包主键获取红包
     * @param couponId
     * @return
     * */
    Coupon getCoupon(String couponId);


}
