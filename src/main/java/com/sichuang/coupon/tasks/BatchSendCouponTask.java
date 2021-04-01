package com.sichuang.coupon.tasks;

import com.sichuang.coupon.mappers.CouponTaskMapper;
import com.sichuang.coupon.po.CouponTask;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.util.ShardingUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xxl.job.core.handler.annotation.XxlJob;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 批量发券
 * 分片任务
 */
@Component
public class BatchSendCouponTask {
    private static Logger logger = LoggerFactory.getLogger(BatchSendCouponTask.class);

    @Autowired
    private CouponTaskMapper couponTaskMapper;

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler(String param) throws Exception {
        logger.info("XXL-JOB, Hello World.");
        for (int i = 0; i < 5; i++) {
            logger.info("beat at:" + i);
            TimeUnit.SECONDS.sleep(1);
        }
        return ReturnT.SUCCESS;
    }

    /**
     * 2、分片广播任务
     */
   @XxlJob("coupon.batchSendCoupons.task")
   public ReturnT<String> batchSendCoupons(String param) throws Exception {
        /**
         * 获取分片参数
         */
        ShardingUtil.ShardingVO shardingVO = ShardingUtil.getShardingVo();
        int totalShardings = shardingVO.getTotal();
        int index = shardingVO.getIndex();
        logger.info("共 {} 片 第 {} 片", totalShardings,index);
        for (int i = 0; i < totalShardings; i++) {
            if (i == index) {
                logger.info("第 {} 片, 命中分片开始处理", i);
                List<CouponTask> lists=  couponTaskMapper.queryCouponsBySharding(totalShardings,index,10);
                for(CouponTask couponTask :lists){
                    logger.info("处理任务：{},批次号：{}，发放用户:{}",couponTask.getTaskId(),couponTask.getBatchId(),couponTask.getUserId());
                }
            } else {
                logger.info("第 {} 片, 忽略", i);
            }
        }
       return ReturnT.SUCCESS;
    }
}
