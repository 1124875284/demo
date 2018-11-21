package com.example.cloud.system.redis.impl;

import com.example.cloud.system.redis.RedisService;
import lombok.Setter;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RedisServiceImpl implements RedisService {
    private final StringRedisTemplate template;
    @Setter
    private long keyExpireSeconds;


    public RedisServiceImpl(StringRedisTemplate template) {
        this.template = template;
    }


    @Override
    public void set(String key, String value) {

    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public String getPrefix() {
        return null;
    }

    @Override
    public void delete(String key) {
        template.delete(this.getPrefix() + ":" + key);
    }

    @Override
    public void deleteAll() {
        template.execute((RedisCallback<Void>) connection -> {
            connection.flushAll();
            return null;
        });
    }

    @Override
    public void flushDB() {
        template.execute((RedisCallback<Void>) connection -> {
            connection.flushDb();
            return null;
        });

    }

    @Override
    public Boolean setKeyExpire(String key, Long timeout) {
        return template.boundValueOps(getPrefix() + ":" + key).expire(timeout, TimeUnit.SECONDS);
    }

    @Override
    public Long getKeyExpire(String key) {
        return template.boundValueOps(getPrefix() + ":" + key).getExpire();
    }

    @Override
    public Long getDefaultExpireTime() {
        return this.keyExpireSeconds;
    }

    @Override
    public void hmset(String key, Map<Object, Object> value) {

    }

    @Override
    public Map<Object, Object> hmget(String key) {
        return null;
    }

    @Override
    public Boolean hdel(String indexCode, String detailCode) {
        return null;
    }

    @Override
    public String hmget(String key, String field) {
        return null;
    }

    @Override
    public boolean setIfAbsent(String key, String value) {
        return false;
    }

    @Override
    public boolean setIfAbsent(String key, String value, long keyExpireSeconds) {
        return false;
    }

    @Override
    public void setAdd(String key, String... value) {

    }

    @Override
    public Boolean isSetMember(String key, String value) {
        return null;
    }

    @Override
    public Long incr(String key) {
        return null;
    }

    @Override
    public Long incr(String key, long liveTime) {
        return null;
    }


}
