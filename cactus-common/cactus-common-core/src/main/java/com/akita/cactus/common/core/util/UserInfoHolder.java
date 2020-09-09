package com.akita.cactus.common.core.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSONObject;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class UserInfoHolder {

    public static UserInfo getCurrentUser(){
        //从Header中获取用户信息
        return Optional.ofNullable((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .map( servletRequestAttributes -> {
                    HttpServletRequest request = servletRequestAttributes.getRequest();
                    String userStr = request.getHeader("user");
                    return new JSONObject(userStr);
                }).map(userJson -> UserInfo.builder()
                        .id(Convert.toLong(userJson.get("id")))
                        .username(userJson.getStr("user_name"))
                        .roles(Convert.toList(String.class,userJson.get("authorities")))
                        .build()
                ).orElse(new UserInfo());
    }

}
