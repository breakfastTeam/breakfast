package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Express;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.OrderDetail;

import java.util.List;

/**
 * Created by kkk .
 */
public interface OrderService {

    /**
     * 保存订单详情
     * @param orderDetail
     * @return
     */
    String saveOrderDetail(OrderDetail orderDetail);

    List<Express> getExpressByUser(String userId);
    /**
     * 保存订单
     * @param order
     * @return
     */
    String saveOrderWithDetail(Order order);
}
