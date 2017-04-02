package com.yl.dao;

import java.util.List;

import com.yl.pojo.Bills;
import com.yl.vo.BillsVo;

public interface BillsDao {
	
	List<Bills> queryBills(BillsVo vo);
	
	Bills queryBills(Integer id);
	
	void saveBills(Bills bills);
}
