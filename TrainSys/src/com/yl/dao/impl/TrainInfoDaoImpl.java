package com.yl.dao.impl;

import java.util.List;

import com.yl.dao.TrainInfoDao;
import com.yl.entity.TrainInfo;
import com.yl.vo.TrainInfoVo;

public class TrainInfoDaoImpl extends BaseDao implements TrainInfoDao{

	@Override
	public List<TrainInfo> queryAll(int currentPage, int pageSize,
			TrainInfoVo vo) {
		String sql = "select * from train_info where 1=1";
		sql = setCondition(vo, sql);
		sql += " limit ? , ?";
		return super.excuteQuery(sql, (currentPage - 1) * pageSize , pageSize);
	}

	private String setCondition(TrainInfoVo vo, String sql) {
		if (vo != null) {
			if (vo.getType() == 1) {
				if (vo.getBegin() != null) {
					if (vo.getEnd() != null) {
						sql += " and strat_time between '"+vo.getBegin()+"' and '"+vo.getEnd()+"'";
					}else {
						sql += " and start_time >= '"+vo.getBegin()+"'";
					}
				}else {
					if (vo.getEnd() != null) {
						sql += " and start_time <= '"+vo.getEnd()+"'";
					}
				}
			}
			if (vo.getType() == 2) {
				if (vo.getBegin() != null) {
					if (vo.getEnd() != null) {
						sql += " and arrival_time between '"+vo.getBegin()+"' and '"+vo.getEnd()+"'";
					}else {
						sql += " and arrival_time >= '"+vo.getBegin()+"'";
					}
				}else {
					if (vo.getEnd() != null) {
						sql += " and arrival_time <= '"+vo.getEnd()+"'";
					}
				}
			}
		}
		return sql;
	}

	@Override
	public TrainInfo queryById(String trainNo) {
		String sql = "select * from train_info where train_no = ?";
		List<TrainInfo> list = super.excuteQuery(sql, trainNo);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public int save(TrainInfo entity) {
		String sql = "insert into train_info values(?, ? , ? , ? ,? ,? , ? , ?)";
		return super.excuteUpdate(sql, entity.getTrainNo() , entity.getStartStation() , entity.getArrivalStation() ,entity.getStartTime() ,entity.getArrivalTime() ,entity.getType() ,entity.getRuntime() ,entity.getMile());
	}

	@Override
	public int del(String trainNo) {
		String sql = "delete from train_info where train_no = ?";
		return super.excuteUpdate(sql, trainNo);
	}

	@Override
	public int update(TrainInfo entity) {
		return 0;
	}

	@Override
	public int getCount(TrainInfoVo vo) {
		String sql = "select * from train_info where 1=1";
		sql = this.setCondition(vo, sql);
		List<TrainInfo> list = super.excuteQuery(sql);
		return list.size();
	}
}
