package com.sichuang.coupon.repository;

import com.sichuang.coupon.exception.TransactionException;
import com.sichuang.coupon.mappers.CouponFreezeRecordMapper;
import com.sichuang.coupon.po.CouponFreezeRecord;
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
