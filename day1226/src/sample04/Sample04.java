package sample04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * ģ��ATM���뿨������������У��Ĺ���
 * ģ��SQLע��©��
 * @author Administrator
 *
 */
public class Sample04 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�˺ţ�");
		String cardId = sc.nextLine();
		System.out.println("���룺");
		String pwd = sc.nextLine();
		
		//��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select count(*) from cardInfo where cardId = '"+cardId+"' and pwd = '"+pwd+"'";
		String url = "jdbc:mysql://localhost:3306/bank?"+"user=root&password=YL635901";
		//���Ӷ���
		Connection conn = null;
		//�������
		Statement stmt = null;
		//���������
		ResultSet rs = null;
		
		try {
			//��������
			conn = DriverManager.getConnection(url);
			//��������
			stmt = conn.createStatement();
			//ִ������
			rs = stmt.executeQuery(sql);
			//���������
			rs.next();
			int count = rs.getInt(1);//?
			if (count>0) {
				System.out.println("���У��ͨ��");
			}else {
				System.out.println("���벻��ȷ");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if (rs!=null) {
				//�ر�����
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
