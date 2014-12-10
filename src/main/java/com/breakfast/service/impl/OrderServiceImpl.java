package com.breakfast.service.impl;

import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TOrderDetail;
import com.breakfast.domain.tables.pojos.OrderDetail;
import com.breakfast.domain.tables.records.TOrderDetailRecord;
import com.breakfast.service.OrderService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
