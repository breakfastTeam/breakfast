package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.SetMeal;
import com.breakfast.dto.CGetSetMealDetailDTO;
import com.breakfast.dto.CGetSetMealsDTO;
import com.breakfast.service.SetMealService;
import com.core.page.Page;
import com.core.utils.IMsgUtil;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
    public String cGetSetMeals(@RequestBody final String reqData, final HttpServletRequest request){
        String rtnResult;
        IMsgUtil msgUtil = new IMsgUtil();
        JSONObject json;
        JSONObject bodyObj;
        try {
            json=JSONObject.fromObject(reqData);
            bodyObj=json.getJSONObject("body");
            int pageNo = Integer.parseInt(bodyObj.getString("pageNo"));
            if (pageNo>0){
                Page<Record> page = new Page<Record>(IConstants.DEFAULT_PAGE_SIZE, pageNo);
                page = setMealService.query(page);//获取到符合条件的套餐

                Result<Record> result = page.getResult();
                List<CGetSetMealsDTO> resultList = new ArrayList<CGetSetMealsDTO>();
                for (int i = 0; i < result.size(); i++){
                    CGetSetMealsDTO getSetMealsDTO = new CGetSetMealsDTO();
                    getSetMealsDTO.setSetMealId((String)result.getValue(i, IConstants.SET_MEAL_ID));
                    getSetMealsDTO.setSetName((String)result.getValue(i, IConstants.SET_NAME));
                    getSetMealsDTO.setPrice((BigDecimal) result.getValue(i, IConstants.PRICE));
                    getSetMealsDTO.setPrivilege((BigDecimal) result.getValue(i, IConstants.PRIVILEGE));
                    getSetMealsDTO.setStatus((String)result.getValue(i, IConstants.STATUS));
                    getSetMealsDTO.setFoodCount((Integer)result.getValue(i, IConstants.FOOD_COUNT));
                    getSetMealsDTO.setPageNo(pageNo);
                    resultList.add(getSetMealsDTO);
                }
                rtnResult = msgUtil.generateHeadMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS).generateRtnMsg(resultList);
            }else{
                rtnResult = msgUtil.generateHeadMsg(IConstants.ERROR_CODE, IConstants.OPERATE_ERROR).generateRtnMsg();
            }
        }catch(Exception e){
            e.printStackTrace();
            rtnResult = msgUtil.generateHeadMsg(IConstants.ERROR_CODE, IConstants.OPERATE_ERROR).generateRtnMsg();
        }
        return rtnResult;
    }

    /**
     * 获取套餐详情
     * @author Felix
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cGetSetMealDetail")
    public String cGetSetMealDetail(@RequestBody final String reqData, final HttpServletRequest request){
        String rtnResult;
        IMsgUtil msgUtil = new IMsgUtil();
        JSONObject json;
        JSONObject bodyObj;
        try {
            json=JSONObject.fromObject(reqData);
            bodyObj=json.getJSONObject("body");
            String setMealId = bodyObj.getString("setMealId");
            if (StringUtils.isNotBlank(setMealId)){
                Record record = setMealService.getSetMeal(setMealId);//获取到符合条件的套餐
                CGetSetMealDetailDTO getSetMealDetailDTO = new CGetSetMealDetailDTO();

//                rtnResult = msgUtil.generateHeadMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS).generateRtnMsg(getSetMealDetailDTO);
            }else{
                rtnResult = msgUtil.generateHeadMsg(IConstants.ERROR_CODE, IConstants.OPERATE_ERROR).generateRtnMsg();
            }
        }catch(Exception e){
            e.printStackTrace();
            rtnResult = msgUtil.generateHeadMsg(IConstants.ERROR_CODE, IConstants.OPERATE_ERROR).generateRtnMsg();
        }
        return null;
    }
}
