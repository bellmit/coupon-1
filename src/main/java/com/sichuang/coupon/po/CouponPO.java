package com.sichuang.coupon.po;

import com.sichuang.coupon.domain.Coupon;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class CouponPO extends Coupon {
    private Date createTime;

    private Date updateTime;

    public CouponPO(Long couponId, Integer couponType, Integer couponStatus, Integer batchId, String name, Integer loanNo, Integer validateDayNumber, Date validateEndDate, Date usedTime, Date startTime, String attributeData, Integer version) {
        super(couponId, couponType, couponStatus, batchId, name, loanNo, validateDayNumber, validateEndDate, usedTime, startTime, attributeData, version);
    }
}