package com.yl.biz.impl;

import java.util.List;

import com.yl.biz.TrainInfoBiz;
import com.yl.dao.TrainInfoDao;
import com.yl.dao.impl.TrainInfoDaoImpl;
import com.yl.entity.TrainInfo;
import com.yl.vo.TrainInfoVo;

public class TrainInfoBizImpl implements TrainInfoBiz {
	private TrainInfoDao dao = new TrainInfoDaoImpl();
	@Override
	public List<TrainInfo> findAll(int currentPage, int pageSize, TrainInfoVo vo) {
		return dao.queryAll(currentPage, pageSize, vo);
	}

	@Override
	public TrainInfo findById(String trainNo) {
		return dao.queryById(trainNo);
	}

	@Override
	public int save(TrainInfo entity) {
		return dao.save(entity);
	}

	@Override
	public int del(String trainNo) {
		return dao.del(trainNo);
	}

	@Override
	public int update(TrainInfo entity) {
		return dao.update(entity);
	}

	@Override
	public int getTotalPage(int pageSize, TrainInfoVo vo) {
		return (dao.getCount(vo) - 1) / pageSize + 1;
	}

}
