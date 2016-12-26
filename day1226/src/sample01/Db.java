package sample01;

import java.sql.*;

public class Db {
	public static void main(String[] args) {
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		Connection conn = null;
		try {
			//建立连接
			conn = DriverManager.getConnection(url);
			System.out.println("connect success!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			//关闭连接
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
