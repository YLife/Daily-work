package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * �˽ӿڹ涨һ��������������е�һ��ӳ��Ϊһ��ʵ��
 * @author Administrator
 *
 */
public interface EntityResultSetMapping<E> {
	/**
	 * ��rs�е�һ��ӳ��Ϊָ������(E)��ʵ��
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	E mapping(ResultSet rs) throws SQLException;
}
