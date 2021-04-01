package com.sichuang.coupon.po;

import java.util.Date;
import java.util.Random;

public class CouponTaskFactory {

    public static CouponTask createCouponTask() {
        return CouponTask.builder().
                taskId(getFixLenthString()).
                userId(getFixLenthString()).
                batchId(getFixLenthString()).
                handler("sendTask").
                status(0).
                maxRetryCount(10).
                retryCount(0).
                runTime(new Date()).
                createTime(new Date()).
                version(1).build();
    }

    private static long getFixLenthString() {
        Random rm = new Random();
        // 获得随机数
        long pross = (1 + rm.nextLong()) * 10 * 10 * 10 * 10 * 10 * 10;
        return pross;
    }
}
