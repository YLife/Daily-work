package dao.impl.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dao.EntityResultSetMapping;

/**
 * DAO层工具类
 * @author Administrator
 *
 */
public class DbUtil {

	// 加载驱动
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static final String url = "jdbc:mysql://localhost:3306/bank?user=root&password=okay";

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url);
	}

	/**
	 * 关闭数据库连接
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
	 * 执行增删改
	 * @param sql INSERT,UPDATE,DELETE语句
	 * @param params T-SQL语句中的？参数列表
	 * @return 数据库受影响的行数
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
	 * 执行查询
	 * @param ersm 行=>实体 转换器，这是一种回调/委托（delegate）设计方式
	 * @param sql SELECT语句
	 * @param params T-SQL语句中的？参数列表
	 * @return 实体集合
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
				// 把rs中的一行记录映射为一个实体
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
