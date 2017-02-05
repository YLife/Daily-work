package com.yl.interfaces.dao;

import java.util.List;

/**
 * 创建泛型接口，简化dao层代码
 * @author Administrator
 *
 * @param <E>
 */
public interface BaseDao<E> {
	/**
	 * 通过id查询记录
	 * @param id
	 * @return
	 */
	E queryById(Object id);
	
	/**
	 * 查询所有记录
	 * @return
	 */
	List<E> queryAll();
	
	/**
	 * 添加一条记录
	 * @param entity
	 * @return
	 */
	int add(E entity);
	
	/**
	 * 通过id删除记录
	 * @param id
	 * @return
	 */
	int delete(Object id);
	
	/**
	 * 修改记录
	 * @param entity
	 * @return
	 */
	int update(E entity);
	
	
}
