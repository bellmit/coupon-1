//package com.coupon;
//
//
//
//import com.coupon.redis.RedisService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.web.WebAppConfiguration;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//
//
//@SpringBootTest
//@EnableAutoConfiguration
//@WebAppConfiguration
//public class RedisServiceTest {
//    @Autowired
//    private JedisPool jedisPool;
//
//    @Autowired
//    private  RedisService redisService;
//
//    @Test
//    public void redisget(){
//        Jedis jedis = null;
//        try {
//            jedis = jedisPool.getResource();
//            jedis.incr("number2");
//            jedis.incrBy("number",10);
//            System.out.println("OK");
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//        }
//    }
//
//
//    @Test
//    public void redisCurrentLock(){
//        try {
//            redisService.setCurrentLock("coupon_lock", "1234");
//            Thread.sleep(10);
//            redisService.deleteCurrentLock("coupon_lock", "1234");
//        }catch (Throwable throwable){
//            System.out.println(throwable.toString());
//        }
//    }
//
//
//    @Test
//    public void  testPlusBatchAssignCount(){
//        redisService.plusBatchAssignCount(1116661L,7);
//    }
//
//}
