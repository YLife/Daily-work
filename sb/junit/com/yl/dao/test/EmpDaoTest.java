package com.yl.dao.test;


import org.junit.Test;

import com.yl.dao.EmpDao;
import com.yl.entity.Emp;

public class EmpDaoTest {
	private EmpDao dao = new EmpDao();
	@Test
	public void testQueryById() {
		Emp emp = dao.queryById(7521);
		System.out.println(emp + "============");
	}

}
