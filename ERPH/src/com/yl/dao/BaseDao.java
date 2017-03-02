package com.yl.dao;

import java.util.List;

/**
 * 创建泛型接口，简化数据访问层接口
 * @author Mr.Yang
 *
 * @param <E>
 * @param <T>
 */
public interface BaseDao<E, T> {
	
	/**
	 * 分页查询
	 * @param currentPage 当前页
	 * @param pageSize 页大小
	 * @param vo 条件信息
	 * @return 实体对象集合
	 */
	List<E> queryList(Integer currentPage , Integer pageSize , T vo);
	
	/**
	 * 查询所有记录
	 * @return 实体对象集合
	 */
	List<E> queryAll();
	
	/**
	 * 根据编号查询记录
	 * @param id 编号
	 * @return 实体对象
	 */
	E queryById(Object id);
	
	/**
	 * 添加或修改记录
	 * @param entity 实体对象
	 */
	void saveOrUpdate(E entity);
	
	/**
	 * 通过编号删除记录
	 * @param id 编号
	 */
	void del(Object id);
	
	/**
	 * 查询记录总条数
	 * @param vo 条件对象
	 * @return 总条数
	 */
	int getCount(T vo);
	
}
