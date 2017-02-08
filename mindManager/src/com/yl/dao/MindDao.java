package com.yl.dao;

import java.util.List;

import com.yl.entity.Mind;

/**
 * 对持久化操作进行抽象
 * @author Administrator
 *
 */
public interface MindDao {
	/**
	 * 查询所有心情信息
	 * @return 心情信息集合
	 */
	List<Mind> queryAll();
	
	/**
	 * 查询指定心情信息
	 * @param id
	 * @return mind实体
	 */
	Mind queryById(int id);
	
	/**
	 * 修改心情信息
	 * @param entity
	 * @return 受影响的行数
	 */
	int update(Mind entity);
}
