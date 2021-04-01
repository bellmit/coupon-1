package com.sichuang.coupon.domain;

import com.sichuang.coupon.enums.CouponStatus;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Coupon {

    private Long couponId;

    private Integer couponType;

    private Integer couponStatus;

    private Integer batchId;

    private String name;

    private Integer loanNo;

    private Integer validateDayNumber;

    private Date validateEndDate;

    private Date usedTime;

    private Date startTime;

    private String attributeData;

    private Integer version;


    public Coupon(Long couponId, Integer couponType, Integer couponStatus, Integer batchId, String name, Integer loanNo, Integer validateDayNumber, Date validateEndDate, Date usedTime, Date startTime, String attributeData, Integer version) {
        this.couponId = couponId;
        this.couponType = couponType;
        this.couponStatus = couponStatus;
        this.batchId = batchId;
        this.name = name;
        this.loanNo = loanNo;
        this.validateDayNumber = validateDayNumber;
        this.validateEndDate = validateEndDate;
        this.usedTime = usedTime;
        this.startTime = startTime;
        this.attributeData = attributeData;
        this.version = version;
    }

    /**
     * 冻结
     */
    public  void freeze(){
        this.couponStatus = CouponStatus.FROZEN.getValue();
    }


}
