package com.breakfast.service.impl;

import com.alipay.util.UtilDate;
import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TExpress;
import com.breakfast.domain.tables.TOrder;
import com.breakfast.domain.tables.pojos.Express;
import com.breakfast.domain.tables.pojos.Feedback;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.OrderDetail;
import com.breakfast.domain.tables.records.TFeedbackRecord;
import com.breakfast.domain.tables.records.TOrderDetailRecord;
import com.breakfast.domain.tables.records.TOrderRecord;
import com.breakfast.service.FeedbackService;
import com.breakfast.service.OrderService;
import com.core.utils.IUUIDGenerator;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    DSLContext creator;

    @Override
    public String saveFeedback(Feedback feedback) {
        feedback.setFeedbackId(IUUIDGenerator.getUUID());
        TFeedbackRecord record = creator.newRecord(Tables.Feedback, feedback);
        record.store();
        int count=creator.executeInsert(record);
        return record.getFeedbackId();
    }
}
