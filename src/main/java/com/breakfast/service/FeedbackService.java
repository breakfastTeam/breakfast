package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Feedback;

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
