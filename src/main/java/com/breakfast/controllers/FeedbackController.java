package com.breakfast.controllers;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.Feedback;
import com.breakfast.service.FeedbackService;
import com.core.utils.IMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by kkk .
 */
@Controller
@RequestMapping("/mobile")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    /**
     * 保存意见反馈
     * @author Felix
     * 变更记录:
     *
     */
    @ResponseBody
    @RequestMapping(value = "/cFeedback")
    public Map<String,Object> cFeedback(@ModelAttribute Feedback feedback){
        IMsgUtil msgUtil = new IMsgUtil();
        String id = feedbackService.saveFeedback(feedback);
        return msgUtil.generateMsg(IConstants.SUCCESS_CODE, IConstants.OPERATE_SUCCESS, id);
    }

}
