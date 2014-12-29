package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.RawMaterial;
import com.breakfast.service.RawMaterialService;
import com.core.utils.IMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class RawMaterialController {

    @Autowired
    RawMaterialService rawMaterialService;
    /**
     * 保存我的红包信息
     * @author Felix
     * 变更记录:
     */
    @ResponseBody
    @RequestMapping(value = "/cFindRawMaterial")
    public Map<String,Object> cFindRawMaterial(){
        IMsgUtil msgUtil = new IMsgUtil();
        List<RawMaterial> rawMaterials = rawMaterialService.findRawMaterial();
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, rawMaterials);
    }
}
