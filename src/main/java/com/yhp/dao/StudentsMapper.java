package com.yhp.dao;

import com.hezho.bean.Students;

public interface StudentsMapper {
    int deleteByPrimaryKey(Integer studentid);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}