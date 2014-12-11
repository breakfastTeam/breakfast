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
import com.breakfast.domain.tables.records.TUserRecord;
import com.breakfast.service.UserService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        TUserRecord record = dsl.newRecord(Tables.User, user);
        record.store();
        int count=dsl.executeInsert(record);
        return count;
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
        return result;
    }

    @Override
    public List<Coupon> loadUserCoupons(String userId) {
        TCoupon coupon = Tables.Coupon.as("c");
        List<Coupon> coupons = dsl.selectFrom(coupon)
                .where(coupon.userId.equal(userId))
                .and(coupon.status.equal(IConstants.COUPON_STATUS_ENABLE))
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
        return orders;
    }
}