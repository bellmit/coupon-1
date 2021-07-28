package com.coupon.enums;

import com.coupon.redis.Storekey;

public enum RedisCategoryEnum {
    /**
     * 用户领券的次数
     */
    COUPON_USER_CPUNT("coupon_user_count"),

    /**
     * 券批次发送的数量
     */
    COUPON_BATCH_ASSIGN_COUNT("coupon_batch_assign_count"),

    COUPON_CURRENT_LOCK("coupon_current_lock");

    private final String value;

    RedisCategoryEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String buildRedisKey(Object... arguments) {
       return new Storekey(this.getValue(),arguments).toString();
    }

}
