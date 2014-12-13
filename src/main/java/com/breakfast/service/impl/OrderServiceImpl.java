package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TExpress;
import com.breakfast.domain.tables.TOrder;
import com.breakfast.domain.tables.TOrderDetail;
import com.breakfast.domain.tables.pojos.Express;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.OrderDetail;
import com.breakfast.domain.tables.records.TOrderDetailRecord;
import com.breakfast.service.OrderService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    DSLContext creator;

    @Override
    public String saveOrderDetail(OrderDetail orderDetail) {
        TOrderDetailRecord record = creator.newRecord(Tables.OrderDetail, orderDetail);
        record.store();
        int count=creator.executeInsert(record);
        return record.getDetailId();
    }

    @Override
    public List<Express> getExpressByUser(String userId) {
        TOrder order = Tables.Order.as("o");
        TExpress express = Tables.Express.as("e");

        List<Express> expresses = creator.select(express.latitude, express.longitude)
                .from(express)
                .join(order)
                .on(order.orderId.equal(express.orderId))
                .where(order.customerId.equal(userId))
                .and(order.status.equal(IConstants.ORDER_STATUS_DRAFT).or(order.status.equal(IConstants.ORDER_STATUS_DISTRIBUTION)))
                .orderBy(order.createTime)
                .fetchInto(Express.class);
        return expresses;
    }
}
