package com.jiuzhang.seckillservice.dao.mappers;

import com.jiuzhang.seckillservice.dao.po.SeckillStock;

public interface SeckillStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillStock record);

    int insertSelective(SeckillStock record);

    SeckillStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillStock record);

    int updateByPrimaryKey(SeckillStock record);
}