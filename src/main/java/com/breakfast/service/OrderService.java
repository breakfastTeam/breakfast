package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Express;
import com.breakfast.domain.tables.pojos.OrderDetail;

import java.util.List;

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

    List<Express> getExpressByUser(String userId);
}
