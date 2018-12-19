package com.mybatis.user.dao.imp;

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

import com.mybatis.user.entity.User;

public class UserDaoImpl {
	
	private SqlSession session = null;
	
	@Before
	public void testBefore() throws IOException {
		
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		// 读取主配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory ssf = ssfb.build(inputStream);
		
		session = ssf.openSession();
		
	}

	@Test
	public void selectAll() throws IOException {
		
		List<User> userList = session.selectList("com.mybatis.user.dao.imp.UserDaoImpl.selectAll");
		userList.forEach(user -> System.out.println(user));
		
	}
	
	@Test
	public void selectAll2() throws IOException {
		
		List<Map<String, Object>> userMap = session.selectList("com.mybatis.user.dao.imp.UserDaoImpl.selectAll2");
		userMap.forEach(user -> System.out.println(user));
		
	}
	
	@Test
	public void selectById() throws IOException {
		
		Long id = 2L;
		Map<String, Object> userMap = session.selectOne("com.mybatis.user.dao.imp.UserDaoImpl.selectById", id);
		System.out.println(userMap);
		
	}
	
	@Test
	public void selectByParams() throws IOException {
		
		Map<String, Object> params = new HashMap<>();
		params.put("username", "王八");
		params.put("password", "123456");
		Map<String, Object> userMap = session.selectOne("com.mybatis.user.dao.imp.UserDaoImpl.selectByParams", params);
		System.out.println(userMap);
		
	}
	
	@Test
	public void selectByParams2() throws IOException {
		
		User params = new User();
		params.setPassword("123456");
		params.setUserName("王八");
		Map<String, Object> userMap = session.selectOne("com.mybatis.user.dao.imp.UserDaoImpl.selectByParams2", params);
		System.out.println(userMap);
		
	}
	
	/*
	 * 模糊查询
	 */
	@Test
	public void selectByParams3() {
		
		Map<String, Object> params = new HashMap<>();
		params.put("password", "3");
		List<Map<String, Object>> userMap = session.selectList("com.mybatis.user.dao.imp.UserDaoImpl.selectByParams3", params);
		userMap.forEach(user -> System.out.println(user));
		
	}
	@Test
	public void selectByParams4() {
		
		Map<String, Object> params = new HashMap<>();
		params.put("password", "3");
		List<Map<String, Object>> userMap = session.selectList("com.mybatis.user.dao.imp.UserDaoImpl.selectByParams4", params);
		userMap.forEach(user -> System.out.println(user));
		
	}
	
	/*
	 * insert, update, delete 必须提交事务才能执行成功
	 */
	@Test
	public void addUser() {
		
		Map<String, Object> params = new HashMap<>();
		params.put("username", "小白");
		params.put("password", "123");
		
		int result = session.insert("com.mybatis.user.dao.imp.UserDaoImpl.addUser", params);
		// 必须提交事务
		session.commit();
		System.out.println(result);
		
	}
	
	@Test
	public void updateUser() {
		
		Map<String, Object> params = new HashMap<>();
		params.put("username", "小白");
		params.put("password", "123123123aaaa");
		
		int result = session.update("com.mybatis.user.dao.imp.UserDaoImpl.updateUser", params);
		// 必须提交事务
		session.commit();
		System.out.println(result);
		
	}
	
	@Test
	public void deleteUser() {
		
		Map<String, Object> params = new HashMap<>();
		params.put("username", "小白");
		
		int result = session.delete("com.mybatis.user.dao.imp.UserDaoImpl.deleteUser", params);
		// 必须提交事务
		session.commit();
		System.out.println(result);
		
	}
	
}
