package com.yl.dao;

import java.sql.ResultSet;

/**
 * 将结果集中的一行记录映射为一个实体
 * @author Administrator
 * @param <E>
 *
 */
public interface ResultMapper<E> {
	E resultMapping(ResultSet rs);
}
