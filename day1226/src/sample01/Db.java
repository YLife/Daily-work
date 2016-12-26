package sample01;

import java.sql.*;

public class Db {
	public static void main(String[] args) {
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		Connection conn = null;
		try {
			//��������
			conn = DriverManager.getConnection(url);
			System.out.println("connect success!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			//�ر�����
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
