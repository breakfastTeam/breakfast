package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TFood;
import com.breakfast.domain.tables.pojos.Food;
import com.breakfast.domain.tables.pojos.SetMeal;
import com.breakfast.service.FileService;
import com.breakfast.service.FoodService;
import com.core.page.Page;
import org.joda.time.DateTime;
import org.jooq.DSLContext;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk on 14/12/8.
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    DSLContext creator;
    @Autowired
    private FileService fileService;

    @Override
    public Page<Food> query(Page<Food> page) {
        TFood food = Tables.Food.as("food");
        int count=creator.selectFrom(food)
                .where(food.status.notEqual(IConstants.SET_MEAL_STATUS_DISCARD))
                .and(food.realFoodCount.greaterThan(0)).fetchCount();
        page.setTotalCount(count);
        List<Food> result =
                creator.selectFrom(food)
                        .where(food.status.notEqual(IConstants.SET_MEAL_STATUS_DISCARD))
                        .and(food.realFoodCount.greaterThan(0))
                        .orderBy(food.showOrder)
                        .limit(((page.getPageNo() - 1)) * page.getPageSize(), page.getPageSize())
                        .fetch().into(Food.class);
        Map<String, Object> extMap = null;
        for (Food f : result) {
            extMap=new HashMap<String, Object>();
            if (StringUtils.isBlank(f.getOrginPicId())) {
                continue;
            }
            String sPath = fileService.get(f.getSmallPicId()).getFilePath();
            String oPath = fileService.get(f.getOrginPicId()).getFilePath();
            extMap.put("sPath", sPath);
            extMap.put("oPath", oPath);
            f.setExtMap(extMap);
        }
        page.setResult(result);
        return page;
    }
}
