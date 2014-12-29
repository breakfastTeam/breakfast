package com.breakfast.service.impl;

import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.pojos.Feedback;
import com.breakfast.domain.tables.records.TFeedbackRecord;
import com.breakfast.service.FeedbackService;
import com.core.utils.IUUIDGenerator;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
