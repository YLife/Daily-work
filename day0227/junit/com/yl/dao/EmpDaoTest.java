package com.yl.dao;


import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.yl.entity.Emp;

public class EmpDaoTest {
	private EmpDao dao = new EmpDao();
	
	@Test
	public void testQueryEmps() {
		List<Emp> list = dao.queryEmps();
		for (Emp emp : list) {
			System.out.println(emp.getEname() + ":" + emp.getDeptno());
		}
	}
	
	@Test
	public void testQueryById() {
		Emp emp = dao.queryById(7369);
		System.out.println(emp.getEname() + ":" + emp.getDeptno());
	}
	
	@Test
	public void testQueryByName() {
		List<Emp> list = dao.queryByName("A");
		for (Emp emp : list) {
			System.out.println(emp.getEname() + ":" + emp.getDeptno());
		}
	}
	
	@Test
	public void testQueryEmpByCondition() {
		Emp emp = new Emp();
		emp.setEname("%A%");
		Calendar calendar = Calendar.getInstance();
		calendar.set(1981, 00, 01);
		emp.setHiredate(calendar.getTime());
		List<Emp> list = dao.queryEmpByCondition(emp);
		for (Emp emps : list) {
			System.out.println(emps.getEname() + ":" + emps.getDeptno());
		}
	}

	@Test
	public void testQueryByMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ename", "%A%");
		map.put("deptno", 10);
		List<Emp> list = dao.queryByMap(map);
		for (Emp emps : list) {
			System.out.println(emps.getEname() + ":" + emps.getDeptno());
		}
	}
	
	@Test
	public void testQueryByChoose() {
		Emp emp = new Emp();
		emp.setEname("%A%");
		Calendar calendar = Calendar.getInstance();
		calendar.set(1981, 00, 01);
		emp.setHiredate(calendar.getTime());
		emp.setDeptno(10);
		List<Emp> list = dao.queryByChoose(emp);
		for (Emp emps : list) {
			System.out.println(emps.getEname() + ":" + emps.getDeptno());
		}
	}

	@Test
	public void testQueryEmp() {
		List<Emp> list = dao.queryEmp();
		for (Emp emp : list) {
			System.out.println( emp.getEname() + ":" + emp.getSal());
		}
	}
	
	@Test
	public void testQueryCount() {
		int count = dao.queryCount();
		System.out.println(count);
	}
	
	@Test
	public void testAddEmp() {
		Emp emp = new Emp();
		emp.setEname("shit");
		dao.addEmp(emp);
	}
	
	@Test
	public void testUpdateEmp() {
		Emp emp = new Emp();
		emp.setEmpno(Integer.valueOf(7956));
		emp.setEname("cshit");
		emp.setSal(Double.valueOf(2000));
		emp.setComm(Double.valueOf(500));
		dao.updateEmp(emp);
	}
	
	@Test
	public void testDelEmp() {
		dao.delEmp(7950);
	}
}
