package dao.impl.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dao.EntityResultSetMapping;

/**
 * DAO�㹤����
 * @author Administrator
 *
 */
public class DbUtil {

	// ��������
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static final String url = "jdbc:mysql://localhost:3306/bank?user=root&password=okay";

	/**
	 * ��ȡ���ݿ�����
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url);
	}

	/**
	 * �ر����ݿ�����
	 * 
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	public void close(ResultSet rs, Statement stmt, Connection conn) {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	/**
	 * ִ����ɾ��
	 * @param sql INSERT,UPDATE,DELETE���
	 * @param params T-SQL����еģ������б�
	 * @return ���ݿ���Ӱ�������
	 */
	public int executeUpdate(String sql, Object... params) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = this.getConnection();
			stmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			return stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(null, stmt, conn);
		}
		return 0;
	}
	
	/**
	 * ִ�в�ѯ
	 * @param ersm ��=>ʵ�� ת����������һ�ֻص�/ί�У�delegate����Ʒ�ʽ
	 * @param sql SELECT���
	 * @param params T-SQL����еģ������б�
	 * @return ʵ�弯��
	 */
	public <E> List<E> executeQuery(EntityResultSetMapping<E> ersm, String sql, Object... params){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<E> list = new ArrayList<E>();
		try {
			conn = this.getConnection();
			stmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			rs = stmt.executeQuery();
			while (rs.next()) {
				// ��rs�е�һ�м�¼ӳ��Ϊһ��ʵ��
				E entity = ersm.mapping(rs);
				list.add(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(null, stmt, conn);
		}
		return list;
	}

}
