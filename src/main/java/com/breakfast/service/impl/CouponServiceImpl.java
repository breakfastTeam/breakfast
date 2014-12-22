package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TCoupon;
import com.breakfast.domain.tables.TSendCoupon;
import com.breakfast.domain.tables.pojos.Coupon;
import com.breakfast.domain.tables.pojos.SendCoupon;
import com.breakfast.domain.tables.records.TCouponRecord;
import com.breakfast.domain.tables.records.TSendCouponRecord;
import com.breakfast.service.CouponService;
import com.breakfast.service.SendCouponService;
import com.core.utils.IUUIDGenerator;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    DSLContext creator;
    @Autowired
    SendCouponService sendCouponService;

    @Override
    public Coupon generateCoupon(String sendCouponId, String userId) {
        SendCoupon sendCoupon = sendCouponService.getSendCoupon(sendCouponId);

        BigDecimal money = sendCoupon.getPrice();
        int num = sendCoupon.getNum();
        BigDecimal redPaperPrice;
        if(num > 1){
            BigDecimal bigDecimalNum = new BigDecimal(num);
            redPaperPrice = money.divide(bigDecimalNum, IConstants.MONEY_SCALE, BigDecimal.ROUND_HALF_UP);
        }else{
            redPaperPrice = money;
        }

        Coupon coupon = new Coupon();
        String couponId = IUUIDGenerator.getUUID();
        coupon.setCouponId(couponId);
        coupon.setSendCouponId(sendCouponId);
        coupon.setPrice(redPaperPrice);
        coupon.setUserId(userId);
        coupon.setSource(sendCoupon.getSource());
        TCouponRecord tCouponRecord = creator.newRecord(Tables.Coupon, coupon);
        creator.executeInsert(tCouponRecord);

        int leftNum = sendCoupon.getNum() - 1;
        BigDecimal leftMoney = sendCoupon.getPrice().min(redPaperPrice);
        sendCoupon.setNum(leftNum);
        sendCoupon.setPrice(leftMoney);
        if(leftNum <= 0 || leftMoney.compareTo(BigDecimal.ZERO)<=0){
            sendCoupon.setStatus(IConstants.DISCARD);
        }
        TSendCouponRecord tSendCouponRecord = creator.newRecord(Tables.SendCoupon, sendCoupon);
        creator.executeUpdate(tSendCouponRecord);
        return coupon;
    }
}
