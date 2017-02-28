package com.yl.dao;


import java.util.List;

import org.junit.Test;

import com.yl.entity.Emp;

public class EmpDaoTest {
	private EmpDao dao = new EmpDao();
	@Test
	public void test() {
		List<Emp> list= dao.queryEmps();
		for (Emp emp : list) {
			System.out.println(emp.getEname() + ":" + emp.getDept().getDname());
		}
	}

}
