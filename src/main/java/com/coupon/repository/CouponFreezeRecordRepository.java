package com.coupon.repository;

import com.coupon.exception.TransactionException;
import com.coupon.mappers.CouponFreezeRecordMapper;
import com.coupon.po.CouponFreezeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponFreezeRecordRepository {
    @Autowired
    private CouponFreezeRecordMapper couponFreezeRecordMapper;

    public void insert(CouponFreezeRecord record) {
        int rows = couponFreezeRecordMapper.insert(record);
        TransactionException.rollbackCause("插入冻结记录异常", rows);
    }
}
