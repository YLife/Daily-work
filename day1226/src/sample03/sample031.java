package sample03;
import java.sql.*;
import java.util.Scanner;

/**
 * ִ����������
 * @author Administrator
 *
 */
public class sample031 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ģ�����п�����");
		System.out.println("�˺ţ�");
		String cardId = sc.next();
		System.out.println("���룺");
		String pwd = sc.next();
		System.out.println("��");
		double balance = sc.nextDouble();
		
		//��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "insert into cardInfo(cardId,pwd,balance) values('"+cardId+"','"+pwd+"',"+balance+")";
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		
		//���Ӷ���
		Connection conn = null;
		//�������
		Statement stmt = null;
		
		try {
			//��������
			conn = DriverManager.getConnection(url);
			//��������
			stmt = conn.createStatement();
			//ִ������
			int row = stmt.executeUpdate(sql);
			System.out.println("��Ӱ�������:"+row);
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
