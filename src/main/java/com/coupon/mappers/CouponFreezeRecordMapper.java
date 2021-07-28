package com.coupon.mappers;

import com.coupon.po.CouponFreezeRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponFreezeRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponFreezeRecord record);

    int insertSelective(CouponFreezeRecord record);

    CouponFreezeRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponFreezeRecord record);

    int updateByPrimaryKey(CouponFreezeRecord record);
}