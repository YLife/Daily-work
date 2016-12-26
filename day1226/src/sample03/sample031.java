package sample03;
import java.sql.*;
import java.util.Scanner;

/**
 * 执行增操作，
 * @author Administrator
 *
 */
public class sample031 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("模拟银行开户：");
		System.out.println("账号：");
		String cardId = sc.next();
		System.out.println("密码：");
		String pwd = sc.next();
		System.out.println("余额：");
		double balance = sc.nextDouble();
		
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "insert into cardInfo(cardId,pwd,balance) values('"+cardId+"','"+pwd+"',"+balance+")";
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		
		//连接对象
		Connection conn = null;
		//命令对象
		Statement stmt = null;
		
		try {
			//建立连接
			conn = DriverManager.getConnection(url);
			//创建命令
			stmt = conn.createStatement();
			//执行命令
			int row = stmt.executeUpdate(sql);
			System.out.println("受影响的行是:"+row);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
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
