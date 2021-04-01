package com.sichuang.coupon.mappers;

import com.sichuang.coupon.po.NotifyMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
public interface NotifyMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NotifyMsg record);

    int insertSelective(NotifyMsg record);

    NotifyMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NotifyMsg record);

    int updateByPrimaryKey(NotifyMsg record);
}