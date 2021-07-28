package com.coupon.service;

import com.coupon.repository.CouponFreezeRecordRepository;
import com.coupon.repository.CouponRepository;
import com.coupon.repository.factory.CouponFreezeRecordFactory;
import com.coupon.requests.FreezeCouponRequest;
import com.coupon.enums.FreezeStatus;
import com.coupon.po.CouponPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CouponFreezeService {

    @Autowired
    private CouponFreezeRecordFactory couponFreezeRecordFactory;

    @Autowired
    private CouponFreezeRecordRepository couponFreezeRecordRepository;

    @Autowired
    private CouponRepository couponRepository;

    /**
     * 冻结
     * 插入冻结记录
     * 修改券的状态为冻结
     */
    @Transactional(rollbackFor = Exception.class)
    public void freezeCoupon(FreezeCouponRequest freezeCouponRequest) {
        //1.插入冻结记录
        couponFreezeRecordRepository.insert(couponFreezeRecordFactory.newCouponFreezeRecordInstance(freezeCouponRequest.getBizSerialNumber(),
                        FreezeStatus.FROZEN, freezeCouponRequest.getUserId(), freezeCouponRequest.getCouponId()));
       CouponPO couponPO = couponRepository.queryCoupon(freezeCouponRequest.getCouponId());
       couponPO.freeze();
       //2.修改券的状态为冻结
        couponRepository.update(couponPO);
    }
}
