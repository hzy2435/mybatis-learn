package com.mybatis.one2one.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.one2one.entities.Husband;

public class One2OneDaoImpl {
	
	private SqlSession session = null;
	
	@Before
	public void beforeMethod() throws IOException {
		
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory ssf = ssfb.build(inputStream);
		
		session = ssf.openSession();
		
	}
	
	@Test
	public void selectHusbandById() {
		
		List<Husband> husbandList = session.selectList("com.mybatis.one2one.dao.impl.One2OneDaoImpl.selectHusbandById");
		husbandList.forEach(husband -> System.out.println(husband));
		
	}

}
