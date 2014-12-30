package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TCoupon;
import com.breakfast.domain.tables.TSendCoupon;
import com.breakfast.domain.tables.pojos.SendCoupon;
import com.breakfast.service.SendCouponService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class SendCouponServiceImpl implements SendCouponService {

    @Autowired
    DSLContext creator;

    @Override
    public SendCoupon getSendCouponByUserId(String userId) {
        TCoupon coupon = Tables.Coupon.as("c");
        TSendCoupon sendCoupon = Tables.SendCoupon.as("s");

        SendCoupon sc = creator.select(sendCoupon.sendCouponId, sendCoupon.source, sendCoupon.url)
                .from(sendCoupon)
                .where(sendCoupon.status.equal(IConstants.ENABLE))
                .and(sendCoupon.sendCouponId.notIn(creator.select(coupon.sendCouponId)
                                .from(coupon)
                                .where(coupon.status.notEqual(IConstants.DISCARD))
                                .and(sendCoupon.sendCouponId.eq(coupon.sendCouponId))
                                .and(coupon.userId.eq(userId))
                ))
                .and(sendCoupon.source.eq(userId))
                .orderBy(sendCoupon.createTime)
                .fetchAnyInto(SendCoupon.class);
        return sc;
    }

    @Override
    public SendCoupon getSendCoupon(String sendCouponId) {
        TSendCoupon sendCoupon = Tables.SendCoupon.as("s");
        SendCoupon sc = creator.select()
                .from(sendCoupon)
                .where(sendCoupon.status.equal(IConstants.ENABLE))
                .and(sendCoupon.sendCouponId.eq(sendCouponId))
                .orderBy(sendCoupon.createTime)
                .fetchOneInto(SendCoupon.class);
        return sc;
    }

}
