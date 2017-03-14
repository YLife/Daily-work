package com.yl.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.dao.EmpDao;
import com.yl.pojo.Emp;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao dao = (EmpDao) factory.getBean("empDao");
		List<Emp> list = dao.queryList();
		for (Emp emp : list) {
			System.out.println(emp.getEname());
		}
	}
}
