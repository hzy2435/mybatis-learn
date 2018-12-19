package com.mybatis.generator.eclipse.dao.impl;

import com.mybatis.generator.eclipse.entities.Computer;

public interface ComputerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Computer record);

    int insertSelective(Computer record);

    Computer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Computer record);

    int updateByPrimaryKey(Computer record);
}