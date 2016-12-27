package dbUtil;

import interfaces.EntityResultSetMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO�㹤����
 * @author Administrator
 *
 */
public class DbUtil {
	
	public static final String URL = "jdbc:mysql://localhost:3306/bank?user=root&password=YL635901";
	
	//����������ֻ��ִ��һ�μ��ɣ�
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
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL);
	}
	
	/**
	 * �ر����ݿ�����
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	public void close(ResultSet rs,PreparedStatement stmt,Connection conn){
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn!=null) {
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
	 * @param params
	 * @return
	 */
	public int excuteUpdate(String sql,Object... params){
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = this.getConnection();
			stmt = conn.prepareStatement(sql);
			if (params!=null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i+1, params[i]);
				}
			}
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(null, stmt, conn);
		}		
		return 0;
	}
	
	/**
	 * ִ�в�ѯ
	 * @param ersm
	 * @param sql
	 * @param params
	 * @return
	 */
	public <E> List<E> excuteQuery(EntityResultSetMapping<E> ersm,String sql,Object... params) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		//���ڴ�Ž���������õ���ʵ��
		List<E> list = new ArrayList<>();
		
		try {
			conn = this.getConnection();
			stmt = conn.prepareStatement(sql);
			if (params!=null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i+1,params[i]);
				}
			}
			rs =stmt.executeQuery();
			while(rs.next()){
				//��rs�е�һ�м�¼ӳ���һ��ʵ��
				E entity = ersm.mapping(rs);
				list.add(entity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(rs, stmt, conn);
		}
		return list;
	}
	
	
}
