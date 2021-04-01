package com.sichuang.coupon.mappers;

import com.sichuang.coupon.po.CouponTask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CouponTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponTask record);

    int insertSelective(CouponTask record);

    CouponTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponTask record);

    int updateByPrimaryKeyWithBLOBs(CouponTask record);

    int updateByPrimaryKey(CouponTask record);

    List<CouponTask> queryCouponsBySharding(@Param("totalNumber") long totalNumber,@Param("index") long index,@Param("limit") long limit);
}