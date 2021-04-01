package com.sichuang.coupon.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FreezeCouponRequest {
    private long couponId;

    private String bizSerialNumber;

    private String productNo;

    private Long userId;
}
