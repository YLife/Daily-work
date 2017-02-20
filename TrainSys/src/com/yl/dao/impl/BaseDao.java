package com.yl.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.yl.entity.TrainInfo;

/**
 * 持久化操作，抓取、释放数据库资源
 * @author Mr.Yang
 *
 */
public class BaseDao {
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数据库连接
	 * @return conn
	 */
	public Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/train?user=root&password=YL635901");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 关闭数据库连接
	 * @param rs 结果集对象
	 * @param stmt 语句对象
	 * @param conn 连接对象
	 */
	public void close(ResultSet rs , PreparedStatement stmt , Connection conn){
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 通用的查询数据库操作
	 * @param sql 
	 * @param map
	 * @param params
	 * @return 实体集合
	 */
	public List<TrainInfo> excuteQuery(String sql , Object...params ){
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<TrainInfo> list = new ArrayList<TrainInfo>();
		try {
			stmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			rs = stmt.executeQuery();
			System.out.println("ok");
			//解析结果集
			while (rs.next()) {
				TrainInfo entity = new TrainInfo(rs.getString("train_no"), rs.getString("start_station"), rs.getString("arrival_station"), rs.getString("start_time"), rs.getString("arrival_time"), rs.getString("type"), rs.getString("runtime"), rs.getDouble("mile"));
				list.add(entity);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(rs, stmt, conn);
		}
		return null;
	}
	
	/**
	 * 通用的更新数据库操作
	 * @param sql
	 * @param params
	 * @return 受影响的行数
	 */
	public int excuteUpdate(String sql , Object...params){
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(null, stmt, conn);
		}
		return 0;
	}
}
