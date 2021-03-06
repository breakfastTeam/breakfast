package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Food;
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

    /**
     * 获取单品详情
     * @param foodId
     * @return
     */
    Food getFood(String foodId);


    public int update(Food food);

}
