package com.yl.biz;

import java.util.List;

import com.yl.pojo.Bills;
import com.yl.vo.BillsVo;

public interface BillsBiz {
	List<Bills> findBills(BillsVo vo);
	
	Bills findById(Integer id);
	
	void saveBills(Bills bills);
}	
