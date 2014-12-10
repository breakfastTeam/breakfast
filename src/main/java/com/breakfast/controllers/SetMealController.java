package com.breakfast.controllers;

import com.alibaba.fastjson.JSONObject;
import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.SetMeal;
import com.breakfast.provider.FastJson;
import com.breakfast.provider.JSONObjectWrapper;
import com.breakfast.service.SetMealService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk on 14/11/19.
 */
@Controller
@RequestMapping("/mobile")
public class SetMealController {
    @Autowired
    private SetMealService setMealService;

    /**
     * 获取套餐列表
     * @author Felix
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cGetSetMeals")
    public Map<String,Object> cGetSetMeals(@FastJson Page<SetMeal> page){
        IMsgUtil msgUtil = new IMsgUtil();
        page = setMealService.query(page);//获取到符合条件的套餐
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, page);
    }

    /**
     * 获取套餐详情
     * @author Felix
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cGetSetMealDetail")
    public Map<String,Object> cGetSetMealDetail(@RequestParam String setMealId){
        IMsgUtil msgUtil = new IMsgUtil();
        SetMeal setMeal = setMealService.getSetMeal(setMealId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, setMeal);
    }
}
