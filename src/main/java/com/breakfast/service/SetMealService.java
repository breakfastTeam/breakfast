package com.breakfast.service;

import com.breakfast.domain.tables.pojos.SetMeal;
import com.breakfast.domain.tables.records.TSetMealRecord;
import com.core.page.Page;

/**
 * Created by qingfeilee on 2014/11/21.
 */
public interface SetMealService {
    public void add(TSetMealRecord setMeal);

    /**
     * 分页查询套餐
     * @param page
     * @return
     */
    public Page<SetMeal> query(Page<SetMeal> page);
    public void update(SetMeal setMeal);
    public SetMeal getSetMeal(String setMealId);

}
