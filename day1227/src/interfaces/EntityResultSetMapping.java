package interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * �˽ӿڹ涨һ����������������е�һ��ӳ��Ϊһ��ʵ��
 * @author Administrator
 * @param <E>
 *
 */
public interface EntityResultSetMapping<E> {
	
	/**
	 * ��rs�е�һ��ӳ��Ϊָ�����͵ģ�E����ʵ��
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	E mapping(ResultSet rs) throws SQLException;
}
