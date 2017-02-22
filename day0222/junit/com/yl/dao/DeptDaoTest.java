package com.yl.dao;
import org.junit.Test;

public class DeptDaoTest {
	private DeptDao dao = new DeptDao();
	@Test
	public void testQueryDepts() {
		dao.queryDepts();
	}
	
	@Test
	public void testRemoveDept(){
		dao.removeDept();
	}

}
