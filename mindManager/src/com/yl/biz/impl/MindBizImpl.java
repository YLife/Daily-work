package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.MindBiz;
import com.yl.dao.MindDao;
import com.yl.dao.impl.MindImpl;
import com.yl.entity.Mind;

public class MindBizImpl implements MindBiz {
	MindDao md = new MindImpl();
	@Override
	public Mind findById(int id) {
		Mind entity = md.queryById(id);
		return entity;
	}

	@Override
	public List<Mind> findAll() {
		List<Mind> list = md.queryAll();
		return list;
	}

	@Override
	public int edit(Mind entity) {
		int row = md.update(entity);
		return row;
	}

}
