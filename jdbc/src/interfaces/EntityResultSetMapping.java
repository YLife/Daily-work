package interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 此接口规定一种能力：将结果集中的一行映射为一个实体
 * @author Administrator
 * @param <E>
 *
 */
public interface EntityResultSetMapping<E> {
	
	/**
	 * 将rs中的一行映射为指定类型的（E）的实体
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	E mapping(ResultSet rs) throws SQLException;
}
