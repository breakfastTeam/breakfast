package com.breakfast.service;

import com.breakfast.domain.tables.records.SetMealRecord;
import com.core.page.Page;
import org.jooq.Record;

/**
 * Created by qingfeilee on 2014/11/21.
 */
public interface SetMealService {
    public void add(SetMealRecord setMeal);
    public Page<Record> query(Page<Record> page);
    public void update(SetMealRecord setMeal);
    public Record getSetMeal(String setMealId);
}
