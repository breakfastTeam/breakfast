package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Express;
import com.breakfast.domain.tables.pojos.Feedback;
import com.breakfast.domain.tables.pojos.Order;
import com.breakfast.domain.tables.pojos.OrderDetail;

import java.util.List;

/**
 * Created by kkk .
 */
public interface FeedbackService {

    /**
     * 保存投诉建议信息
     * @param feedback
     * @return
     */
    String saveFeedback(Feedback feedback);

}
