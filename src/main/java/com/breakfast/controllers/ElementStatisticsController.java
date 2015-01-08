package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.domain.tables.pojos.UserElementStatistics;
import com.breakfast.service.ElementContentService;
import com.breakfast.service.ElementStatisticsService;
import com.core.utils.IMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class ElementStatisticsController {

    @Autowired
    ElementStatisticsService elementStatisticsService;
    /**
     * 获取用户当天的营养记录
     * @author Felix
     * 变更记录:
     */
    @ResponseBody
    @RequestMapping(value = "/cGetTodayElementStatistics")
    public Map<String,Object> cGetTodayElementStatistics(@RequestParam String userId){
        IMsgUtil msgUtil = new IMsgUtil();
        List<UserElementStatistics> elementContents = elementStatisticsService.getTodayElementStatistics(userId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, elementContents);
    }

    /**
     * 获取用户当天的营养记录
     * @author Felix
     * 变更记录:
     */
    @ResponseBody
    @RequestMapping(value = "/cGetHistoryElementStatistics")
    public Map<String,Object> cGetHistoryElementStatistics(@RequestParam String userId){
        IMsgUtil msgUtil = new IMsgUtil();
        List<UserElementStatistics> elementContents = elementStatisticsService.getHistoryElementStatistics(userId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, elementContents);
    }
}
