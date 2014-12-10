package com.breakfast.service;

import com.breakfast.domain.tables.pojos.OrderDetail;

/**
 * Created by kkk .
 */
public interface OrderService {

    /**
     * 保存订单
     * @param orderDetail
     * @return
     */
    String saveOrderDetail(OrderDetail orderDetail);
}
