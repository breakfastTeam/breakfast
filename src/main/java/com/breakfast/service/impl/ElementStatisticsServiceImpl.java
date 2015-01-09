package com.breakfast.service.impl;

import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TElement;
import com.breakfast.domain.tables.TElementContent;
import com.breakfast.domain.tables.TUserElementStatistics;
import com.breakfast.domain.tables.pojos.Element;
import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.domain.tables.pojos.UserElementStatistics;
import com.breakfast.service.ElementContentService;
import com.breakfast.service.ElementService;
import com.breakfast.service.ElementStatisticsService;
import com.google.common.collect.Lists;
import org.joda.time.DateTime;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.jooq.impl.DSL.sum;

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
        DateTime now = DateTime.now();
        return getUserElementStatisticsByDates(userId,now.withTimeAtStartOfDay(), now.millisOfDay().withMaximumValue());
    }

    @Override
    public List<UserElementStatistics> getHistoryElementStatistics(String userId){
        return getUserElementStatisticsByDates(userId,null,null);

    }

    private List<UserElementStatistics> getUserElementStatisticsByDates(String userId,DateTime begin, DateTime end) {
        TUserElementStatistics ues = Tables.UserElementStatistics.as("ues");
        TElement e = Tables.Element.as("e");

        Condition condition = ues.userId.eq(userId);
        if (begin != null && end != null) {
            condition.and(ues.createTime.between(begin,end));
        }

        List<Record2<BigDecimal,String>> records = creator.select(sum(ues.quantity).as("quantity"),ues.elementId)
                .from(ues)
                .join(e).on(e.elementId.equal(ues.elementId))
                .where(condition)
                .groupBy(ues.elementId).fetch();
        List<String> elementIds = Lists.newArrayList();
        for (Record2 record2 : records) {
            elementIds.add(record2.getValue(1).toString());
        }
        List<UserElementStatistics> elementStatistics = Lists.newArrayList();

        Map<String,Element> elements = elementService.getElementsByIds(elementIds);
        UserElementStatistics uesTemp = null;
        for (Record2 record2 : records) {
            uesTemp = new UserElementStatistics();
            uesTemp.setUserId(userId);
            uesTemp.setQuantity((BigDecimal) record2.field1());
            uesTemp.setElement(elements.get(record2.field2()));
            elementStatistics.add(uesTemp);
        }
    }
}
