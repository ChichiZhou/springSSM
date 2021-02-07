package com.hezho.dao;

import com.hezho.bean.Billtype;

import java.util.List;

public interface BilltypeMapper {
    List<Billtype> getBilltype();

    int deleteByPrimaryKey(Integer id);

    int insert(Billtype record);

    int insertSelective(Billtype record);

    Billtype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Billtype record);

    int updateByPrimaryKey(Billtype record);
}