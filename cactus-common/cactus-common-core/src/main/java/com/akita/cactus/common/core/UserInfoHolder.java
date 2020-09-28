package com.akita.cactus.common.core;

import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSONObject;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class UserInfoHolder {
    public static UserInfo getCurrentUser(){
        //从Header中获取用户信息
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String userStr = request.getHeader("user");
        JSONObject userJsonObject = new JSONObject(userStr);
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(userJsonObject.getStr("user_name"));
        userInfo.setId(Convert.toLong(userJsonObject.get("id")));
        userInfo.setRoles(Convert.toList(String.class,userJsonObject.get("authorities")));
        return userInfo;
    }
}
