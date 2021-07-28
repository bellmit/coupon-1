package com.coupon.redis;

import com.coupon.enums.RedisCategoryEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Arrays;
import java.util.UUID;

@Service
public class RedisService {
    private Logger logger = LoggerFactory.getLogger(RedisService.class);
    @Autowired
    private JedisPool jedisPool;

    private Jedis jedisClient;

    private ThreadLocal<String> threadLocalUUID = new ThreadLocal<String>();


    /**
     * 设置并发锁
     *
     * @param bizKey
     * @param bizValue
     */
    public void setCurrentLock(String bizKey, String bizValue) throws Exception {
        try {
            jedisClient = jedisPool.getResource();
            String currentLockKey = RedisCategoryEnum.COUPON_CURRENT_LOCK.buildRedisKey(bizKey, bizValue);
            String uuid = UUID.randomUUID().toString();
            threadLocalUUID.set(uuid);
            jedisClient.set(currentLockKey, uuid, "NX", "PX", 60);
        } catch (Throwable throwable) {
            logger.error(throwable.toString());
            throw new Exception("加锁失败");
        }
    }

    /**
     * 解锁
     *
     * @param bizKey
     * @param bizValue
     * @throws Exception
     */
    public void deleteCurrentLock(String bizKey, String bizValue) throws Exception {
        try {
            String currentLockKey = RedisCategoryEnum.COUPON_CURRENT_LOCK.buildRedisKey(bizKey, bizValue);
            String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
            Object result = jedisClient.eval(script, Arrays.asList(currentLockKey), Arrays.asList(threadLocalUUID.get()));
            if (Integer.valueOf(result.toString()) == 0) {
                logger.error("解锁失败");
                throw new Exception("解锁失败");
            }
        } catch (Throwable throwable) {
            logger.error(throwable.toString());
            throw new Exception("解锁失败");
        }
    }

    /**
     * 增加一个批次发放的数量
     *
     * @param batchId
     * @param sendNumber
     * @return
     */
    public Long plusBatchAssignCount(Long batchId, Integer sendNumber) {
        jedisClient = jedisPool.getResource();
        String batchAssignKey = RedisCategoryEnum.COUPON_BATCH_ASSIGN_COUNT.buildRedisKey(batchId);
        Long totalCount = jedisClient.incrBy(batchAssignKey, sendNumber);
        logger.info("key:{} 本次发放:{} 共发放：{}", batchAssignKey, sendNumber, totalCount);
        return totalCount;
    }

}
