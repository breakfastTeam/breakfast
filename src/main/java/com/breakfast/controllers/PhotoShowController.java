package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.PhotoShow;
import com.breakfast.domain.tables.pojos.RawMaterial;
import com.breakfast.service.PhotoShowService;
import com.breakfast.service.RawMaterialService;
import com.core.utils.IMsgUtil;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class PhotoShowController {

    @Autowired
    PhotoShowService photoShowService;
    /**
     * 保存我的红包信息
     * @author Felix
     * 变更记录:
     */
    @ResponseBody
    @RequestMapping(value = "/cGetPhotoShow")
    public Map<String,Object> cGetPhotoShow(){
        IMsgUtil msgUtil = new IMsgUtil();
        List<PhotoShow> photoShows = photoShowService.findPhotoShow();
        if(photoShows.size()>0){
            DateTime uploadDate = photoShows.get(0).getUploadTime();
            return msgUtil.generateMsg(IConstants.SUCCESS_CODE, uploadDate.getYear()+"-"+uploadDate.getMonthOfYear()+"-"+uploadDate.getDayOfMonth(), photoShows);
        }else {
            return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, photoShows);
        }
    }
}
