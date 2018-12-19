package com.mybatis.one2many.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.one2many.entities.User;

public class One2ManyDaoImpl {

	SqlSession session = null;

	@Before
	public void init() throws IOException {

		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory ssf = ssfb.build(inputStream);

		session = ssf.openSession();

	}

	@Test
	public void selectUserItems() {

		List<User> userList = session.selectList("com.mybatis.one2many.dao.impl.One2ManyDaoImpl.selectUserItems");
		userList.forEach(user -> System.out.println(user));

	}

	@Test
	public void insertUser() {
		
		User user = new User();
		user.setuPassword("password");
		user.setuUsername("username");
		
		int result = session.insert("com.mybatis.one2many.dao.impl.One2ManyDaoImpl.insertUser", user);
		session.commit();
		
		System.out.println("result: " + result);
		System.out.println("user: " + user);
		
	}
	
	@Test
	public void getId() {
		
		Map<String, Object> map = new HashMap<>();
		
		int result = session.insert("com.mybatis.one2many.dao.impl.One2ManyDaoImpl.getId", map);
		session.commit();
		
		System.out.println("result: " + result);
		System.out.println("map.id: " + map.get("id"));
		
	}

}
