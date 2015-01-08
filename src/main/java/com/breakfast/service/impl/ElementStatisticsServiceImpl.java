package com.breakfast.service.impl;

import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TElementContent;
import com.breakfast.domain.tables.TUserElementStatistics;
import com.breakfast.domain.tables.pojos.Element;
import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.domain.tables.pojos.UserElementStatistics;
import com.breakfast.service.ElementContentService;
import com.breakfast.service.ElementService;
import com.breakfast.service.ElementStatisticsService;
import org.joda.time.DateTime;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class ElementStatisticsServiceImpl implements ElementStatisticsService {

    @Autowired
    DSLContext creator;

    @Autowired
    ElementService elementService;


    @Override
    public List<UserElementStatistics> getTodayElementStatistics(String userId){
        TUserElementStatistics ues = Tables.UserElementStatistics.as("ues");
        List<UserElementStatistics> elementStatistics = creator.selectFrom(ues)
                .where(ues.userId.equal(userId))
                .fetchInto(UserElementStatistics.class);
        for (UserElementStatistics elementStatistic:elementStatistics){
            Element element = elementService.getElementById(elementStatistic.getElementId());
            elementStatistic.setElement(element);
        }
        return elementStatistics;
    }

    @Override
    public List<UserElementStatistics> getHistoryElementStatistics(String userId){
        TUserElementStatistics ues = Tables.UserElementStatistics.as("ues");
        List<UserElementStatistics> elementStatistics = creator.selectFrom(ues)
                .where(ues.userId.equal(userId))
                .fetchInto(UserElementStatistics.class);
        for (UserElementStatistics elementStatistic:elementStatistics){
            Element element = elementService.getElementById(elementStatistic.getElementId());
            elementStatistic.setElement(element);
        }
        return elementStatistics;
    }
}
