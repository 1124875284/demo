package com.example.cloud.system.redis;


import java.util.Map;

public interface RedisService {
    void set(String key, String value);

    String get(String key);



    String getPrefix();

    /**
     * 删除指定KEY以及其对应的value值
     *
     * @param key 指定的KEY值
     */
    void delete(String key);

    /**
     * <h1>请务必谨慎使用</h1>
     * <strong>删除Redis所有数据库的数据</strong>
     */
    void deleteAll();

    /**
     * <h1>请务必谨慎使用</h1>
     * <strong>删除当前连接的Redis数据库的数据</strong>
     */
    void flushDB();

    /**
     * 设置指定KEY的过期时间(单位:秒)
     *
     * @param key     指定的KEY值
     * @param timeout 时长(秒)
     * @return 设置成功返回true, 否则返回false
     */
    Boolean setKeyExpire(String key, Long timeout);

    /**
     * 获取指定KEY的过期时间
     *
     * @param key 指定的KEY值
     * @return 过期时间(秒)
     */
    Long getKeyExpire(String key);

    /**
     * 获取默认KEY过期时间(单位:秒)
     *
     * @return 默认过期秒数
     */
    Long getDefaultExpireTime();

    /**
     * redis 操作 hash
     *
     * @param key
     * @param value
     */
    void hmset(String key, Map<Object, Object> value);

    /**
     * redis 操作 hash
     *
     * @param key
     * @return
     */
    Map<Object, Object> hmget(String key);

    /**
     * 删除indexCode中detailCode
     *
     * @param indexCode
     * @param detailCode
     * @return
     */
    Boolean hdel(String indexCode, String detailCode);

    String hmget(String key, String field);

    /**
     * redis 占位锁
     *
     * @param key
     * @param value
     * @return
     */
    boolean setIfAbsent(String key, String value);

    /**
     * redis 占位锁+过期时间
     *
     * @param key
     * @param value
     * @param keyExpireSeconds
     * @return
     */
    boolean setIfAbsent(String key, String value, long keyExpireSeconds);

    /**
     * set集合添加元素
     *
     * @param key
     * @param value
     * @return void
     * @author lichao  2018/6/6
     */
    void setAdd(String key, String... value);

    /**
     * 判断元素是否set集合中的成员
     *
     * @param key
     * @param value
     * @return java.lang.Boolean
     * @author lichao  2018/6/6
     */
    Boolean isSetMember(String key, String value);

    /**
     * 自增序列
     *
     * @param key 业务前缀
     * @return java.lang.String
     * @author lichao  2018/6/8
     */
    Long incr(String key);

    /**
     * 自增序列
     *
     * @param key
     * @param liveTime
     * @return java.lang.String
     * @author lichao  2018/6/8
     */
    Long incr(String key, long liveTime);

}
