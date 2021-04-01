package com.sichuang.coupon.enums;

public enum CouponStatus {

    INIT(1,"已生成"),
    REXEIVE(2,"已领用"),
    FROZEN(3,"已冻结"),
    OUT_DATE(4,"已经过期"),
    USED(5,"已经使用");
    private final Integer value;
    private final String desc;

    CouponStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
