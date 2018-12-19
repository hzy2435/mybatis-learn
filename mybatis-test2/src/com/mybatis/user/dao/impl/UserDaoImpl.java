package com.mybatis.user.dao.impl;

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

public class UserDaoImpl {

	private SqlSession session = null;
	
	@Before
	public void beforeMethod() throws IOException {
		
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory ssf = ssfb.build(inputStream);
		session = ssf.openSession();
		
	}
	
	@Test
	public void selectAll() {
		
		List<Map<String, Object>> userMap = session.selectList("com.mybatis.user.dao.impl.UserDaoImpl.selectAll");
		userMap.forEach(user -> System.out.println(user));
		
	}
	
	@Test
	public void selectByParams() {
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("username", "张三");
		Map<String, Object> userMap = session.selectOne("com.mybatis.user.dao.impl.UserDaoImpl.selectByParams", paramMap);
		System.out.println(userMap);
		
	}
	
	/*
	 * 动态 sql 查询
	 */
	@Test
	public void selectComputesByDynatic() {
		
		Map<String, Object> paramMap = new HashMap<>();
//		paramMap.put("computerName", "联想小新");
//		paramMap.put("brand", "联想");
//		paramMap.put("runMem", 8);
		paramMap.put("price", 10000);
		
		List<Map<String, Object>> computerList = session.selectList("com.mybatis.user.dao.impl.UserDaoImpl.selectComputesByDynatic", paramMap);
		computerList.forEach(computer -> System.out.println(computer));
		
	}
	
	/*
	 * if...else
	 */
	@Test
	public void testIfElse() {
		
		Map<String, Object> paramType = new HashMap<>();
		paramType.put("type", "1");
		List<Map<String, Object>> resultMap = session.selectList("com.mybatis.user.dao.impl.UserDaoImpl.testIfElse", paramType);
		resultMap.forEach(map -> System.out.println(map));
		
	}
	
	/*
	 * 动态更新
	 */
	@Test
	public void dynaticUpdate() {
		
		Map<String, Object> paramType = new HashMap<>();
//		paramType.put("computerName", "小新潮");
//		paramType.put("brand", "联想123");
//		paramType.put("runMem", 16);
//		paramType.put("price", 8000);
		paramType.put("id", 1L);
		
		int result = session.update("com.mybatis.user.dao.impl.UserDaoImpl.dynaticUpdate", paramType);
		
		session.commit();
		System.out.println(result);
		
	}
	
}
