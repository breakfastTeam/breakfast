package com.breakfast.interceptor;

import com.breakfast.constants.IConstants;
import com.breakfast.provider.ExecutionContext;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by kkk on 14/11/27.
 */
public class ExecutionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String contextPath=httpServletRequest.getContextPath();
        String url=httpServletRequest.getServletPath().toString();
        HttpSession session = httpServletRequest.getSession();
        String userId = (String) session.getAttribute(IConstants.SEESION_USER_ID);
        if (StringUtils.isNotBlank(userId)) {
            ExecutionContext.setUserId(userId);
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
