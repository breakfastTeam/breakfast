package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.Food;
import com.breakfast.domain.tables.pojos.Information;
import com.breakfast.provider.FastJson;
import com.breakfast.service.FoodService;
import com.breakfast.service.InformationService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class InformationController {
    @Autowired
    private InformationService informationService;

    /**
     * 获取公告列表
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cGetInformations")
    public Map<String,Object> cGetInformations(@FastJson Page<Information> page){
        IMsgUtil msgUtil = new IMsgUtil();
        page = informationService.query(page);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, page);
    }

}
