package com.yl.biz.impl;
import java.util.List;
import com.yl.biz.EmpBiz;
import com.yl.dao.EmpDao;
import com.yl.pojo.Emp;

public class EmpBizImpl implements EmpBiz {
	private EmpDao dao;
	
	@Override
	public List<Emp> queryEmps() {
		return dao.queryList();
	}

	public EmpDao getDao() {
		return dao;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

}
