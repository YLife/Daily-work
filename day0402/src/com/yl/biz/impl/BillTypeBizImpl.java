package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.BillTypeBiz;
import com.yl.dao.BillTypeDao;
import com.yl.pojo.BillType;

public class BillTypeBizImpl implements BillTypeBiz {
	private BillTypeDao dao;
	
	@Override
	public List<BillType> findTypes() {
		return dao.queryTypes();
	}

	public void setDao(BillTypeDao dao) {
		this.dao = dao;
	}

}
