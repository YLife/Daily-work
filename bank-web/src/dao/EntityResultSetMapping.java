package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 此接口规定一种能力：结果集中的一行映射为一个实体
 * @author Administrator
 *
 */
public interface EntityResultSetMapping<E> {
	/**
	 * 将rs中的一行映射为指定类型(E)的实体
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	E mapping(ResultSet rs) throws SQLException;
}
