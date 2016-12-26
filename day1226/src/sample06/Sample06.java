package sample06;

import java.sql.*;
/**
 * Test
 * @author Administrator
 *
 */
public class Sample06 {
	public static void main(String[] args) {
		//��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select * from cardInfo";
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		//���Ӷ���
		Connection conn = null;
		//�������
		PreparedStatement stmt = null;
		//���������
		ResultSet rs = null;
		
		try {
			//��������
			conn = DriverManager.getConnection(url);
			//�������������Ԥ����
			stmt = conn.prepareStatement(sql);
			//ִ������
			rs = stmt.executeQuery();
			//���������
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
