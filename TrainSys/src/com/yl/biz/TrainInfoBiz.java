package com.yl.biz;

import java.util.List;

import com.yl.entity.TrainInfo;
import com.yl.vo.TrainInfoVo;

/**
 * 业务层接口
 * @author Mr.Yang
 *
 */
public interface TrainInfoBiz {
	/**
	 * 分页查询
	 * @param currentPage
	 * @param pageSize
	 * @param vo
	 * @return 车次信息对象集合
	 */
	List<TrainInfo> findAll(int currentPage , int pageSize , TrainInfoVo vo);
	
	/**
	 * 通过车次查询
	 * @param trainNo
	 * @return
	 */
	TrainInfo findById(String trainNo);
	
	/**
	 * 添加车次信息
	 * @param entity
	 * @return
	 */
	int save(TrainInfo entity);
	
	/**
	 * 删除车次信息
	 * @param entity
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
	 * 获取总页数
	 * @param pageSize
	 * @param vo
	 * @return 总页数
	 */
	int getTotalPage(int pageSize , TrainInfoVo vo);
}
