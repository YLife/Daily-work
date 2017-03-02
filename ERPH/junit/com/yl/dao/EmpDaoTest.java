package com.yl.dao;


import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import com.yl.dao.impl.EmpDaoImpl;
import com.yl.entity.Emp;
import com.yl.vo.EmpVo;

public class EmpDaoTest {
	
	private EmpDao dao = new EmpDaoImpl();
	
	@Test
	public void testQueryListIntegerIntegerEmpVo() {
		EmpVo vo = new EmpVo();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2002, 01, 01);
		vo.setBegin(calendar.getTime());
		List<Emp> list = dao.queryList(1, 5, vo);
		for (Emp emp : list) {
			System.out.println(emp.getEmpName() + ":" + emp.getEmpRole().getRoleName());
		}
 	}
	
	@Test
	public void testQueryById(){
		Emp emp = dao.queryById(Integer.valueOf(100));
		System.out.println(emp.getEmpName() + ":" + emp.getEmpRole().getRoleName() );
	}
	
	@Test
	public void testGetCount(){
		int count = dao.getCount(null);
		System.out.println(count);
	}

}
