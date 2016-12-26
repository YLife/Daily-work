package sample05;

import java.sql.*;
import java.util.Scanner;

/**
 * ģ��ATM�忨�����У��Ĺ���
 * ʹ��PreparedStatement��ֹSQLע��
 * @author Administrator
 *
 */
public class Sample05 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�˺ţ�");
		String cardId = sc.nextLine();
		System.out.println("���룺");
		String pwd = sc.nextLine();
		
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select count(*) from cardInfo where cardId = ? and pwd = ?";
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
			stmt.setString(1, cardId);
			stmt.setString(2, pwd);
			//ִ������
			rs = stmt.executeQuery();
			//���������
			rs.next();
			int count = rs.getInt(1);
			if (count>0) {
				System.out.println("ͨ�������֤");
			}else {
				System.out.println("���벻��ȷ");
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
