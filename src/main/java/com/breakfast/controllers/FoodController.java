package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.Food;
import com.breakfast.provider.FastJson;
import com.breakfast.service.FoodService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class FoodController {
    @Autowired
    private FoodService foodService;

    /**
     * 获取套餐列表
     * @author Felix
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cGetFoods")
    public Map<String,Object> cGetFoods(@FastJson Page<Food> page){
        IMsgUtil msgUtil = new IMsgUtil();
        page = foodService.query(page);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, page);
    }

    @ResponseBody
    @RequestMapping("cGetFoodDetail")
    public Map<String,Object> cGetFoodDetail(@RequestParam String foodId){
        IMsgUtil msgUtil = new IMsgUtil();
        Food food = foodService.getFood(foodId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, food);
    }

}
