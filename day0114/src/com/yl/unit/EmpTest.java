package com.yl.unit;

import static org.junit.Assert.*;

import java.util.List;


import org.junit.Test;

import com.yl.biz.EmpBiz;
import com.yl.biz.impl.EmpBizImpl;
import com.yl.entity.Emp;

public class EmpTest {
	EmpBiz eb = new EmpBizImpl();
	
	@Test
	public void testQuerryById() {
		Emp emp = eb.querryById(7369);
		assertTrue(emp != null);
	}
	
	@Test
	public void testQuerryByPage() {
		List<Emp> list = eb.querryByPage(3, 5);
		assertTrue(list.size() != 0);
	}
	
	@Test
	public void testGetTotalPage() {
		int pages = eb.getTotalPage(5);
		assertTrue(pages != 0);
	}

}
