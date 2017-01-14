package com.yl.dao;

import java.sql.ResultSet;

/**
 * 将结果集中的每一条记录映射为一个对象
 * @author Administrator
 * @param <E>
 *
 */

public interface ResultMapping<E> {
	public E resultMapping(ResultSet rs);
}
