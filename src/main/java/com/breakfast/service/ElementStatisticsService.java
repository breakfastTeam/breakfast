package com.breakfast.service;

import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.domain.tables.pojos.UserElementStatistics;

import java.util.List;

/**
 * Created by kkk .
 */
public interface ElementStatisticsService {

    /**
     * 获取用户当天营养元素
     * @return
     */
    List<UserElementStatistics> getTodayElementStatistics(String userId);

    /**
     * 获取用户历史营养元素
     * @return
     */
    List<UserElementStatistics> getHistoryElementStatistics(String userId);



}
