package com.sichuang.couponPO.mappers;

import com.sichuang.couponPO.po.BatMediaExpireReissuseInterest;

public interface BatMediaExpireReissuseInterestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BatMediaExpireReissuseInterest record);

    int insertSelective(BatMediaExpireReissuseInterest record);

    BatMediaExpireReissuseInterest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BatMediaExpireReissuseInterest record);

    int updateByPrimaryKey(BatMediaExpireReissuseInterest record);
}