package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TCoupon;
import com.breakfast.domain.tables.TSendCoupon;
import com.breakfast.domain.tables.pojos.Feedback;
import com.breakfast.domain.tables.pojos.SendCoupon;
import com.breakfast.domain.tables.records.TFeedbackRecord;
import com.breakfast.service.FeedbackService;
import com.breakfast.service.SendCouponService;
import com.core.utils.IUUIDGenerator;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
                .join(coupon)
                .on(sendCoupon.sendCouponId.notIn(
                        creator.select(coupon.sendCouponId)
                                .from(coupon)
                                .where(coupon.status.notEqual(IConstants.DISCARD))
                                .and(coupon.userId.eq(userId))
                                .fetch()
                ))
                .where(sendCoupon.status.equal(IConstants.ENABLE))
                .orderBy(sendCoupon.createTime)
                .fetchOneInto(SendCoupon.class);
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
