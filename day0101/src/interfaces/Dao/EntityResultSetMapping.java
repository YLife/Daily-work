package interfaces.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * �˽ӿڹ淶һ����������������е�һ��ӳ��Ϊһ��ʵ��
 * @author YangLun
 *
 * @param <E>
 */
public interface EntityResultSetMapping<E>{
	
	/**
	 * ��rs�е�һ��ӳ��Ϊָ�����͵�ʵ��
	 * @param rs
	 * @return	E
	 * @throws SQLException
	 */
	E mapping(ResultSet rs) throws SQLException;
}
