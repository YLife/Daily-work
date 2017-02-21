package com.yl.dao;

import org.junit.Test;

import com.yl.pojo.Emp;

public class EmpDaoTest {
	private EmpDao dao = new EmpDao();
	@Test
	public void testQueryById() {
		Emp emp = dao.queryById(7369);
		System.out.println(emp);
	}
	@Test
	public void testSaveEmp(){
		Emp emp = new Emp();
		emp.setEname("张三");
		dao.savaEmp(emp);
	}
	
	@Test
	public void testRemoveEmp(){
		Emp emp = dao.queryById(7369);
		dao.removeEmp(emp);;
	}
	
	@Test
	public void testUpdateEmp(){
		Emp emp = dao.queryById(7369);
		emp.setEname("王五");
		dao.updateEmp(emp);;
	}
}
