package com.yl.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yl.entity.Emp;

public class EmpDao {
	public List<Emp> queryEmps(){
		SqlSession session = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			List<Emp> list = session.selectList("com.yl.entity.Emp.queryEmps");
			return list;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
}
