package com.yl.dao;

import java.util.List;

import org.junit.Test;

import com.yl.entity.Dept;
import com.yl.entity.Emp;

public class EmpDaoTest {
	private EmpDao dao = new EmpDao();
	
	@Test
	public void testQueryAll() {
		@SuppressWarnings("unused")
		List<Emp> list = dao.queryAll();
		/*for (Emp emp : list) {
			System.out.println(emp.getEname() + ":" + emp.getDept().getDname());
		}关闭部门对象时延迟加载，关闭session后便不能查询部门信息*/
	}
	
	@Test
	public void testSave(){
		Emp emp = new Emp();
		emp.setEname("sb");
		Dept dept = new Dept();
		dept.setDname("sb");
		emp.setDept(dept);
		dao.save(emp, dept);
	}
	
	@Test
	public void testQueryByLeftJoin(){
		List<Object[]> list = dao.queryByLeftJoin();
		for (Object[] objects : list) {
			Emp emp = (Emp)objects[0];
			Dept dept = (Dept)objects[1];
			System.out.println(emp.getEname() + ":" + dept.getDname());
		}
	}
	
	@Test
	public void testQueryByLeftJoinFetch(){
		List<Emp> list = dao.queryByLeftJoinFetch();
		for (Emp emp : list) {
			System.out.println(emp.getEname() + ":" + emp.getDept().getDname());
		}
	}
	
	@Test
	public void testQueryByInnerJoin(){
		List<Object[]> list = dao.queryByInnerJoin();
		for (Object[] objects : list) {
			Emp emp = (Emp)objects[0];
			Dept dept = (Dept)objects[1];
			System.out.println(emp.getEname() + ":" + dept.getDname());
		}
	}
	
	@Test
	public void testQueryByInnerJoinFetch(){
		List<Emp> list = dao.queryByInnerJoinFetch();
		for (Emp emp : list) {
			System.out.println(emp.getEname() + ":" + emp.getDept().getDname());
		}
	}
	
	@Test
	public void testQueryByRightJoin(){
		List<Object[]> list = dao.queryByRightJoin();
		for (Object[] objects : list) {
			Emp emp = (Emp)objects[0];
			Dept dept = (Dept)objects[1];
			System.out.println(emp.getEname() + ":" + dept.getDname());
		}
	}
	
	@Test
	public void testGetCount(){
		int count = dao.getCount();
		System.out.println(count);
	}
	
	@Test
	public void testQueryById(){
		Emp emp = dao.queryById(7369);
	}
}
