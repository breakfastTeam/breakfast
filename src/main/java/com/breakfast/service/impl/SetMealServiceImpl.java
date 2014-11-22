package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.File;
import com.breakfast.domain.tables.SetMeal;
import com.breakfast.domain.tables.records.SetMealRecord;
import com.breakfast.service.SetMealService;
import com.core.page.Page;
import com.core.utils.ITimeUtil;
import com.core.utils.IUUIDGenerator;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record7;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by qingfeilee on 2014/11/21.
 */
@Service("setMealService")
@Transactional
public class SetMealServiceImpl implements SetMealService {
    @Autowired
    DSLContext creator;

    @Override
    public void add(SetMealRecord setMealRecord) {
        SetMeal setMeal = Tables.SetMeal.as("meal");
        creator.insertInto(setMeal)
                .set(setMeal.setMealId, IUUIDGenerator.getUUID())
                .set(setMeal.setName, setMealRecord.getSetName())
                .set(setMeal.introduce, setMealRecord.getIntroduce())
                .set(setMeal.starTime, setMealRecord.getStarTime())
                .set(setMeal.endTime, setMealRecord.getEndTime())
                .set(setMeal.privilege, setMealRecord.getPrivilege())
                .set(setMeal.price, setMealRecord.getPrice())
                .set(setMeal.foodCount, setMealRecord.getFoodCount())
                .set(setMeal.status, IConstants.VALID)
                .set(setMeal.realFoodCount, setMealRecord.getRealFoodCount())
                .set(setMeal.smallPicId, setMealRecord.getSmallPicId())
                .set(setMeal.orginPicId, setMealRecord.getOrginPicId())
                .execute();
    }

    @Override
    public Page<Record> query(Page<Record> page) {
        SetMeal setMeal = Tables.SetMeal.as("meal");
        File file = Tables.File.as("file");
        Result<Record> result =
                creator.select()
                        .from(setMeal)
                        .join(file)
                        .on(setMeal.smallPicId.equal(file.fileId))
                        .where(setMeal.starTime.lessThan(ITimeUtil.getCurrentTime()))
                        .and(setMeal.endTime.greaterThan(ITimeUtil.getCurrentTime()))
                        .and(setMeal.status.notEqual(IConstants.INVALID))
                        .and(setMeal.realFoodCount.greaterThan(0))
                        .orderBy(setMeal.setMealId)
                        .limit(((page.getPageNo() - 1)) * page.getPageSize(), page.getPageSize())
                        .fetch();
        page.setResult(result);
        return page;
    }

    @Override
    public void update(SetMealRecord setMeal) {

    }

    @Override
    public Record getSetMeal(String setMealId) {
        SetMeal setMeal = Tables.SetMeal.as("meal");
        File file = Tables.File.as("file");
        Result<Record> result =
                creator.select()
                        .from(setMeal)
                        .join(file)
                        .on(setMeal.orginPicId.equal(file.fileId))
                        .where(setMeal.setMealId.equal(setMealId))
                        .fetch();
        if(result.size() > 0){
            return result.get(0);
        }else{
            return null;
        }
    }
}
