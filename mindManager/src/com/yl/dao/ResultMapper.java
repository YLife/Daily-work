package com.yl.dao;

import java.sql.ResultSet;
/**
 * 此接口规范一种能力，将结果集中的一行记录映射为一个实体
 * @author Administrator
 *
 * @param <E>
 */
public interface ResultMapper<E> {
	/**
	 * 将结果集中的一行记录映射为一个实体
	 * @param rs
	 * @return E
	 */
	E resultMapping(ResultSet rs);
}
