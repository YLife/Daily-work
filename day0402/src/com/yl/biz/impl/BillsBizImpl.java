package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.BillsBiz;
import com.yl.dao.BillsDao;
import com.yl.pojo.Bills;
import com.yl.vo.BillsVo;

public class BillsBizImpl implements BillsBiz {
	private BillsDao dao;
	
	@Override
	public List<Bills> findBills(BillsVo vo) {
		return dao.queryBills(vo);
	}

	@Override
	public Bills findById(Integer id) {
		return dao.queryBills(id);
	}

	@Override
	public void saveBills(Bills bills) {
		dao.saveBills(bills);
	}

	public void setDao(BillsDao dao) {
		this.dao = dao;
	}
	
}
