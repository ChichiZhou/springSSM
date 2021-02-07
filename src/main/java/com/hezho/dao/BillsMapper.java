package com.hezho.dao;

import com.hezho.bean.Bills;

import java.util.List;

public interface BillsMapper {
    List<Bills> getBills();

    int deleteByPrimaryKey(Integer id);

    int insert(Bills record);

    int insertSelective(Bills record);

    Bills selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);
}