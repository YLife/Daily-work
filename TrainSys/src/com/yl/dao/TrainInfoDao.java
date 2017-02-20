package com.yl.dao;

import java.util.List;

import com.yl.entity.TrainInfo;
import com.yl.vo.TrainInfoVo;

/**
 * dao层接口
 * @author Mr.Yang
 *
 */
public interface TrainInfoDao {
	/**
	 * 分页查询所有车次
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return 车次对象集合
	 */
	List<TrainInfo> queryAll(int currentPage , int pageSize , TrainInfoVo vo);
	
	/**
	 * 通过编号查询车次
	 * @param trainNo
	 * @return 车次对象
	 */
	TrainInfo queryById(String trainNo);
	
	/**
	 * 添加车次信息
	 * @param entity
	 * @return
	 */
	int save(TrainInfo entity);
	
	/**
	 * 删除车次信息
	 * @param trainNo
	 * @return
	 */
	int del(String trainNo);
	
	/**
	 * 更新车次信息
	 * @param entity
	 * @return
	 */
	int update(TrainInfo entity);
	
	/**
	 * 查询记录总条数
	 * @param entity
	 * @return 总条数
	 */
	int getCount(TrainInfoVo vo);
}
