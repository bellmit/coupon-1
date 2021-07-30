//package com.coupon.repository;
//
//import com.coupon.db.mappers.CouponMapper;
//import com.coupon.exception.TransactionException;
//import com.coupon.po.CouponPO;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CouponRepository {
//
//    private CouponMapper couponMapper;
//
//    public void update(CouponPO couponPO) {
//        int rows = couponMapper.updateByPrimaryKeySelective(couponPO);
//        TransactionException.rollbackCause("更新券记录异常", rows);
//    }
//
//    public CouponPO queryCoupon(long couponId){
//        return  couponMapper.selectByPrimaryKey(couponId);
//    }
//}
//couponId