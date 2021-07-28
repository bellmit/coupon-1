package com.coupon.repository.factory;

import com.coupon.enums.FreezeStatus;
import com.coupon.po.CouponFreezeRecord;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CouponFreezeRecordFactory {

    public CouponFreezeRecord  newCouponFreezeRecordInstance(String bizSerialNumber, FreezeStatus freezeStatus,Long userId,Long couponId){
      return CouponFreezeRecord.builder().
              bizSerialNumber(bizSerialNumber).
              freezeStatus(freezeStatus.getValue()).
              userId(userId).
              couponId(couponId).
              version(1).
              createTime(new Date()).
              updateTime(new Date()).
              build();
    }
}
