package com.yl.dao;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.pojo.Emp;

public class EmpDaoTest {
	private BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	private EmpDao dao = (EmpDao) factory.getBean("empDao");
	
	@Test
	public void test() {
		List<Emp> list = dao.queryList();
		for (Emp emp : list) {
			System.out.println(emp.getEname());
		}
	}
	
}
