package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TCoupon;
import com.breakfast.domain.tables.TOrder;
import com.breakfast.domain.tables.TUser;
import com.breakfast.domain.tables.TUserCustomer;
import com.breakfast.domain.tables.pojos.Coupon;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.User;
import com.breakfast.domain.tables.pojos.UserCustomer;
import com.breakfast.domain.tables.records.TUserCustomerRecord;
import com.breakfast.domain.tables.records.TUserRecord;
import com.breakfast.service.UserService;
import com.core.utils.IUUIDGenerator;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk on 14/11/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DSLContext dsl;


    @Override
    public User findUser(User user) {
        TUser u = Tables.User.as("u");
        User result=dsl.selectFrom(u)
                .where(u.status.equal(IConstants.USER_STATUS_ENABLE))
                .and(u.loginName.equal(user.getLoginName()))
                .and(u.password.equal(user.getPassword()))
                .fetchAnyInto(User.class);
        return result;
    }

    @Override
    public int saveUser(User user) {
        if (StringUtils.isBlank(user.getUserId())) {
            String userId = IUUIDGenerator.getUUID();
            user.setUserId(userId);
            TUserRecord record = dsl.newRecord(Tables.User, user);
            record.store();
            int count = dsl.executeInsert(record);
            UserCustomer userCustomer=user.getUserCustomer();
            userCustomer.setUserId(userId);
            TUserCustomerRecord recordCustomer = dsl.newRecord(Tables.UserCustomer, userCustomer);
            recordCustomer.store();
            count += dsl.executeInsert(recordCustomer);
            return count;
        }else{
            TUser u = Tables.User.as("u");
            TUserCustomer uc = Tables.UserCustomer.as("uc");
            TUserRecord record = dsl.fetchOne(u, u.userId.equal(user.getUserId()));
            TUserCustomerRecord recordCustomer = dsl.fetchOne(uc, uc.userId.equal(user.getUserId()));

            record.setUserName(user.getUserName());
            record.setMobile(user.getMobile());
            record.setSex(user.getSex());
            record.setWeixin(user.getWeixin());
            record.setQq(user.getQq());

            recordCustomer.setAddress1(user.getUserCustomer().getAddress1());
            recordCustomer.setAddress2(user.getUserCustomer().getAddress2());
            recordCustomer.setAddress3(user.getUserCustomer().getAddress3());


            int count = record.store();
            count += recordCustomer.store();
            return count;
        }
    }

    @Override
    public User loadUser(String userId) {
        TUser u = Tables.User.as("u");
        TUserCustomer tuc = Tables.UserCustomer.as("uc");
        User result=dsl.selectFrom(u)
                .where(u.userId.equal(userId))
                .fetchAnyInto(User.class);
        UserCustomer uc=dsl.selectFrom(tuc)
                .where(tuc.userId.equal(userId))
                .fetchAnyInto(UserCustomer.class);
        result.setUserCustomer(uc);
        result.setCoupons(loadUserCoupons(userId));
        return result;
    }

    @Override
    public List<Coupon> loadUserCoupons(String userId) {
        TCoupon coupon = Tables.Coupon.as("c");
        List<Coupon> coupons = dsl.selectFrom(coupon)
                .where(coupon.userId.equal(userId))
                .and(coupon.status.equal(IConstants.COUPON_STATUS_ENABLE))
                .and(coupon.startTime.le(DateTime.now()))
                .and(coupon.endTime.ge(DateTime.now()))
                .fetchInto(Coupon.class);
        return coupons;
    }

    @Override
    public List<Order> loadUserOrders(String userId) {
        TOrder order = Tables.Order.as("o");
        List<Order> orders = dsl.selectFrom(order)
                .where(order.customerId.equal(userId))
                .orderBy(order.createTime)
                .fetchInto(Order.class);
        Map<String, Object> extMap = null;
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        for (Order order1 : orders) {
            extMap = new HashMap<String, Object>();
            DateTime createTime = order1.getCreateTime();
            if (createTime != null) {
                extMap.put("createTimeStr",createTime.toString(dtf));
            }
        }
        return orders;
    }
}
