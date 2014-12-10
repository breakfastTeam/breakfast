package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Coupon;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.User;

import java.util.List;

/**
 * Created by kkk on 14/11/28.
 */
public interface UserService {

    /**
     * 查询user
     * @param user
     * @return
     */
    public User findUser(User user);

    int saveUser(User user);

    User loadUser(String userId);

    /**
     * 获取用户代金券
     * @param userId
     * @return
     */
    List<Coupon> loadUserCoupons(String userId);

    /**
     * 获取用户订单
     * @param userId
     * @return
     */
    List<Order> loadUserOrders(String userId);
}
