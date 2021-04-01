package com.sichuang.couponPO.mappers;

import com.sichuang.couponPO.po.TbSeckillActivity;

public interface TbSeckillActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillActivity record);

    int insertSelective(TbSeckillActivity record);

    TbSeckillActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSeckillActivity record);

    int updateByPrimaryKey(TbSeckillActivity record);
}