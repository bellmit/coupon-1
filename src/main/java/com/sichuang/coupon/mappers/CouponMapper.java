package com.sichuang.coupon.mappers;

import com.sichuang.coupon.po.CouponPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponMapper {
    int deleteByPrimaryKey(Long couponId);

    int insert(CouponPO record);

    int insertSelective(CouponPO record);

    CouponPO selectByPrimaryKey(Long couponId);

    int updateByPrimaryKeySelective(CouponPO couponPO);

    int updateByPrimaryKey(CouponPO record);
}