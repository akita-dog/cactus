package com.akita.cactus.gateway.config;

import com.akita.cactus.common.core.config.DefaultRedisRepositoryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableRedisRepositories
public class RedisRepositoryConfig extends DefaultRedisRepositoryConfig {

    @Bean

    @Override
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        return super.redisTemplate(connectionFactory);
    }
}
