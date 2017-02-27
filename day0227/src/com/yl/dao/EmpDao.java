package com.yl.dao;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yl.entity.Emp;
import com.yl.util.MybatisUtil;

public class EmpDao {
	
	public List<Emp> queryEmps(){
		SqlSession session = null;
		List<Emp> list = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			System.out.println(builder);
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			list = session.selectList("com.yl.entity.Emp.queryEmps");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;	
	}
	
	public Emp queryById(Integer id){
		SqlSession session = null;
		Emp emp = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			emp = session.selectOne("com.yl.entity.Emp.queryById" ,id); 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emp;
	}
	
	public List<Emp> queryByName(String name){
		SqlSession session = null;
		List<Emp> list = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			list = session.selectList("com.yl.entity.Emp.queryByName","%"+name+"%");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
 	}
	
	public List<Emp> queryEmpByCondition(Emp emp){
		SqlSession session = null;
		List<Emp> list = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			list = session.selectList("com.yl.entity.Emp.queryEmpByCondition", emp);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Emp> queryByMap(Map<String,Object> map){
		SqlSession session = null;
		List<Emp> list = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			list = session.selectList("com.yl.entity.Emp.queryByMap", map);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Emp> queryByChoose(Emp emp){
		SqlSession session = null;
		List<Emp> list = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			list = session.selectList("com.yl.entity.Emp.queryByChoose", emp);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Emp> queryEmp(){
		SqlSession session = null;
		List<Emp> list = null;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			list = session.selectList("com.yl.entity.Emp.queryEmp");
		} catch (Exception e) {
			System.out.println("==============");
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list ;
	}
	
	public int queryCount(){
		SqlSession session = null;
		Integer count = 0 ;
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(in);
			session = factory.openSession();
			count = session.selectOne("com.yl.entity.Emp.queryCount");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return count.intValue();
	}
	
	
	public void addEmp(Emp emp){
		SqlSession session = MybatisUtil.getSession();
		session.insert("com.yl.entity.Emp.addEmp", emp);
		session.commit();
		MybatisUtil.close();
	}
	
	public void updateEmp(Emp emp){
		SqlSession session = MybatisUtil.getSession();
		session.update("com.yl.entity.Emp.updateEmp", emp);
		session.commit();
		MybatisUtil.close();
	}
	
	public void delEmp(int id){
		SqlSession session = MybatisUtil.getSession();
		session.delete("com.yl.entity.Emp.delEmp", id);
		session.commit();
		MybatisUtil.close();
	}
}
