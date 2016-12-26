package sample06;

import java.sql.*;
/**
 * Test
 * @author Administrator
 *
 */
public class Sample06 {
	public static void main(String[] args) {
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select * from cardInfo";
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		//连接对象
		Connection conn = null;
		//命令对象
		PreparedStatement stmt = null;
		//结果集对象
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = DriverManager.getConnection(url);
			//创建命令，并进行预处理
			stmt = conn.prepareStatement(sql);
			//执行命令
			rs = stmt.executeQuery();
			//解析结果集
			rs.next();
			int value = rs.getInt(3);
			System.out.println(value);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		
	}
}
