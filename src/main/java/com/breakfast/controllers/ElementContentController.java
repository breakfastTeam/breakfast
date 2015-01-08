package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.ElementContent;
import com.breakfast.domain.tables.pojos.PhotoShow;
import com.breakfast.service.ElementContentService;
import com.breakfast.service.PhotoShowService;
import com.core.utils.IMsgUtil;
import org.joda.time.DateTime;
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
public class ElementContentController {

    @Autowired
    ElementContentService elementContentService;
    /**
     * 保存我的红包信息
     * @author Felix
     * 变更记录:
     */
    @ResponseBody
    @RequestMapping(value = "/cGetElementContent")
    public Map<String,Object> cGetElementContent(@RequestParam String objId){
        IMsgUtil msgUtil = new IMsgUtil();
        List<ElementContent> elementContents = elementContentService.findElementContentByObjId(objId);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, elementContents);
    }
}
