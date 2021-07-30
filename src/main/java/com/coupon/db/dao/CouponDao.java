package com.coupon.db.dao;

import com.coupon.db.mappers.CouponMapper;
import com.coupon.db.po.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class CouponDao {

    @Resource
    private CouponMapper couponMapper;

    public void insert(Coupon coupon) {
        couponMapper.insert(coupon);
    }

    public Coupon queryById(long couponId) {
        return couponMapper.selectByPrimaryKey(couponId);
    }

}
