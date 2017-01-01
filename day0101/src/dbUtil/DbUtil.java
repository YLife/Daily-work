package dbUtil;

import interfaces.Dao.EntityResultSetMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO�㹤����
 * @author YangLun
 *
 */
public class DbUtil {
	//��Դ��λ��
	public static final String url = "jdbc:mysql://localhost:3306/bank?user=root&password=YL635901";
	//����������ֻ��ִ��һ�μ���
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 */
	public Connection getConnection(){
		try {
			Connection conn = DriverManager.getConnection(url);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	public void close(ResultSet rs , Statement stmt , Connection conn){
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ִ����ɾ��
	 * @param sql
	 * @param param
	 * @return	��Ӱ�����
	 */
	public int excuteUpdate(String sql , Object... param){
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = this.getConnection();
			stmt = conn.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					stmt.setObject(i + 1, param[i]);
				}
			}
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			this.close(null, stmt, conn);
		}
		return 0;
	}
	
	/**
	 * ִ�в�ѯ����
	 * @param ersm
	 * @param sql
	 * @param param
	 * @return List<E>
	 */
	public <E> List<E> excuteQuery(EntityResultSetMapping<E> ersm , String sql , Object... param){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		//���ڴ�Ž����
		List<E> list = new ArrayList<>();
		try {
			conn = DriverManager.getConnection(url);
			stmt = conn.prepareStatement(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					stmt.setObject(i+1 , param[i]);
				}
			}
			rs = stmt.executeQuery();
			//���������
			while (rs.next()) {
				E entity = ersm.mapping(rs);
				list.add(entity);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			this.close(rs, stmt, conn);
		}
		return null;
	}
}
