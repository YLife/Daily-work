package sample04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 模拟ATM插入卡，密码进行身份校验的过程
 * 模拟SQL注入漏洞
 * @author Administrator
 *
 */
public class Sample04 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("账号：");
		String cardId = sc.nextLine();
		System.out.println("密码：");
		String pwd = sc.nextLine();
		
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select count(*) from cardInfo where cardId = '"+cardId+"' and pwd = '"+pwd+"'";
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		//连接对象
		Connection conn = null;
		//命令对象
		Statement stmt = null;
		//结果集对象
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = DriverManager.getConnection(url);
			//创建命令
			stmt = conn.createStatement();
			//执行命令
			rs = stmt.executeQuery(sql);
			//解析结果集
			rs.next();
			int count = rs.getInt(1);//?
			if (count>0) {
				System.out.println("身份校验通过");
			}else {
				System.out.println("密码不正确");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if (rs!=null) {
				//关闭连接
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
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
