package com.mybatis.one2many.dao;

import com.mybatis.one2many.entities.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

	User selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	int insert(User record);

    int insertSelective(User record);
}