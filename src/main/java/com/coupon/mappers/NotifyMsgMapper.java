package com.coupon.mappers;

import com.coupon.po.NotifyMsg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NotifyMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NotifyMsg record);

    int insertSelective(NotifyMsg record);

    NotifyMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NotifyMsg record);

    int updateByPrimaryKey(NotifyMsg record);
}