package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;

import com.breakfast.domain.tables.TSetMeal;
import com.breakfast.domain.tables.pojos.SetMeal;
import com.breakfast.domain.tables.records.TSetMealRecord;
import com.breakfast.service.FileService;
import com.breakfast.service.SetMealService;
import com.core.page.Page;
import com.core.utils.IUUIDGenerator;
import org.joda.time.DateTime;
import org.jooq.*;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qingfeilee on 2014/11/21.
 */
@Service("setMealService")
@Transactional
public class SetMealServiceImpl implements SetMealService {
    @Autowired
    DSLContext creator;
    @Autowired
    private FileService fileService;
    @Value("host")
    private String host;

    @Override
    public void add(TSetMealRecord TSetMealRecord) {
        TSetMeal setMeal = Tables.SetMeal.as("meal");
        creator.insertInto(setMeal)
                .set(setMeal.setMealId, IUUIDGenerator.getUUID())
                .set(setMeal.setName, TSetMealRecord.getSetName())
                .set(setMeal.introduce, TSetMealRecord.getIntroduce())
                .set(setMeal.startTime, TSetMealRecord.getStartTime())
                .set(setMeal.endTime, TSetMealRecord.getEndTime())
                .set(setMeal.privilege, TSetMealRecord.getPrivilege())
                .set(setMeal.price, TSetMealRecord.getPrice())
                .set(setMeal.foodCount, TSetMealRecord.getFoodCount())
                .set(setMeal.status, IConstants.VALID)
                .set(setMeal.realFoodCount, TSetMealRecord.getRealFoodCount())
                .set(setMeal.smallPicId, TSetMealRecord.getSmallPicId())
                .set(setMeal.orginPicId, TSetMealRecord.getOrginPicId())
                .execute();
    }

    @Override
    public Page<SetMeal> query(Page<SetMeal> page) {
        TSetMeal setMeal = Tables.SetMeal.as("meal");
        int count=creator.selectFrom(setMeal)
                        .where(setMeal.startTime.lessOrEqual(DateTime.now()))
                        .and(setMeal.endTime.greaterOrEqual(DateTime.now()))
                        .and(setMeal.status.notEqual(IConstants.SET_MEAL_STATUS_DISCARD))
                        .and(setMeal.realFoodCount.greaterThan(0)).fetchCount();
        page.setTotalCount(count);
        List<SetMeal> result =
                creator.selectFrom(setMeal)
                        .where(setMeal.startTime.lessOrEqual(DateTime.now()))
                        .and(setMeal.endTime.greaterOrEqual(DateTime.now()))
                        .and(setMeal.status.notEqual(IConstants.SET_MEAL_STATUS_DISCARD))
                        .and(setMeal.realFoodCount.greaterThan(0))
                        .orderBy(setMeal.showOrder)
                        .limit(((page.getPageNo() - 1)) * page.getPageSize(), page.getPageSize())
                        .fetch().into(SetMeal.class);
        Map<String, Object> extMap = null;
        for (SetMeal sm : result) {
            extMap=new HashMap<String, Object>();
            if (StringUtils.isBlank(sm.getOrginPicId())) {
                continue;
            }
            String sPath = fileService.get(sm.getSmallPicId()).getFilePath();
            String oPath = fileService.get(sm.getOrginPicId()).getFilePath();
            extMap.put("sPath", host+sPath);
            extMap.put("oPath", host+oPath);
            sm.setExtMap(extMap);
        }
        page.setResult(result);
        return page;
    }

    @Override
    public void update(TSetMealRecord setMeal) {

    }

    @Override
    public SetMeal getSetMeal(String setMealId) {
        TSetMeal setMeal = Tables.SetMeal.as("meal");
        SetMeal sm =creator.selectFrom(setMeal)
                        .where(setMeal.setMealId.equal(setMealId))
                        .fetchAnyInto(SetMeal.class);
        return sm;
    }
}
