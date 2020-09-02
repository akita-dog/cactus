package com.akita.cactus.auth.service.impl;

import com.akita.cactus.auth.constant.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class ResourceServiceImpl {

    private Map<String, List<String>> resourceRolesMap;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostConstruct
    public void initData() {
        resourceRolesMap = new TreeMap<>();
        resourceRolesMap.put("/api/hello", Arrays.asList("ADMIN"));
        resourceRolesMap.put("/api/user/currentUser", Arrays.asList("ADMIN", "TEST"));

        redisTemplate.opsForHash().putAll(RedisConstant.RESOURCE_ROLES_MAP, resourceRolesMap);
    }
}
