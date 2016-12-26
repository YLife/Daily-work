package sample02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 执行查询，并将结果集解析为对象集合
 * @author Administrator
 *
 */

public class CardInfos {
	public static void main(String[] args) {
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "select * from cardInfo";
		String url = "jdbc:mysql://127.0.0.1:3306/bank?"+"user=root&password=YL635901";
		//连接对象
		Connection conn = null;
		//命令对象
		Statement stmt = null;
		//结果集对象
		ResultSet rs = null;
		//存放结果
		List<Cardinfo> cardInfos = new ArrayList<>();
		try {
			//建立连接
			conn = DriverManager.getConnection(url);
			//创建命令
			stmt = conn.createStatement();
			//执行命令
			rs = stmt.executeQuery(sql);
			//解析结果集
			while (rs.next()) {
				Cardinfo cardInfo = new Cardinfo(rs.getString("cardId"), rs.getString("pwd"), rs.getDouble("balance"));
				cardInfos.add(cardInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			//关闭流（先关闭后打开的）
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
