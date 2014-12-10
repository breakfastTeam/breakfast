package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Food;
import com.breakfast.domain.tables.pojos.SetMeal;
import com.core.page.Page;

/**
 * Created by kkk .
 */
public interface FoodService {

    /**
     * 分页查询单品
     * @param page
     * @return
     */
    public Page<Food> query(Page<Food> page);
}
