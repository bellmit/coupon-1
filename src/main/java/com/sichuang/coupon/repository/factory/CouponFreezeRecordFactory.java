package com.sichuang.coupon.repository.factory;

import com.sichuang.coupon.enums.FreezeStatus;
import com.sichuang.coupon.po.CouponFreezeRecord;
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
