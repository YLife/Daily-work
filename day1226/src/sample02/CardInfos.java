package sample02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * ִ�в�ѯ���������������Ϊ���󼯺�
 * @author Administrator
 *
 */

public class CardInfos {
	public static void main(String[] args) {
		//��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select * from cardInfo";
		String url = "jdbc:mysql://127.0.0.1:3306/bank?"+"user=root&password=YL635901";
		//���Ӷ���
		Connection conn = null;
		//�������
		Statement stmt = null;
		//���������
		ResultSet rs = null;
		//��Ž��
		List<Cardinfo> cardInfos = new ArrayList<>();
		try {
			//��������
			conn = DriverManager.getConnection(url);
			//��������
			stmt = conn.createStatement();
			//ִ������
			rs = stmt.executeQuery(sql);
			//���������
			while (rs.next()) {
				Cardinfo cardInfo = new Cardinfo(rs.getString("cardId"), rs.getString("pwd"), rs.getDouble("balance"));
				cardInfos.add(cardInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			//�ر������ȹرպ�򿪵ģ�
			try {
				rs.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
			try {
				stmt.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for (Cardinfo cardinfo : cardInfos) {
			System.out.println(cardinfo);
		}
	}
}
