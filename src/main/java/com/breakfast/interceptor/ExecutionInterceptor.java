package com.breakfast.interceptor;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.tables.pojos.User;
import com.breakfast.provider.ExecutionContext;
import com.breakfast.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by kkk on 14/11/27.
 */
public class ExecutionInterceptor implements WebRequestInterceptor {
    @Autowired
    private UserService userService;

    @Override
    public void preHandle(WebRequest request) throws Exception {
        String auth=request.getHeader("Authorization");
        if (StringUtils.isNotBlank(auth)) {
            String userId = auth.substring(6);
            User user = userService.loadUser(userId);
            if (user != null) {
                ExecutionContext.setUserId(userId);
            }
        }
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
