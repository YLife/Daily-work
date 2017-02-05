package com.yl.interfaces.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 此接口规范一种能力，将结果集的每一条记录映射为一个实体
 * @author Administrator
 * @param <E>
 *
 */
public interface ResultMapper<E> {
	E resultMapping(ResultSet rs) throws SQLException;
}
