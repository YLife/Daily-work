package sample05;

import java.sql.*;
import java.util.Scanner;

/**
 * 模拟ATM插卡，身份校验的过程
 * 使用PreparedStatement防止SQL注入
 * @author Administrator
 *
 */
public class Sample05 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("账号：");
		String cardId = sc.nextLine();
		System.out.println("密码：");
		String pwd = sc.nextLine();
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select count(*) from cardInfo where cardId = ? and pwd = ?";
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
			stmt.setString(1, cardId);
			stmt.setString(2, pwd);
			//执行命令
			rs = stmt.executeQuery();
			//解析结果集
			rs.next();
			int count = rs.getInt(1);
			if (count>0) {
				System.out.println("通过身份验证");
			}else {
				System.out.println("密码不正确");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
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
		sc.close();
	}
}
