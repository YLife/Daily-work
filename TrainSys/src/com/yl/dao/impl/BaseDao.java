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
 * �־û�������ץȡ���ͷ����ݿ���Դ
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
	 * ��ȡ���ݿ�����
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
	 * �ر����ݿ�����
	 * @param rs ���������
	 * @param stmt ������
	 * @param conn ���Ӷ���
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
	 * ͨ�õĲ�ѯ���ݿ����
	 * @param sql 
	 * @param map
	 * @param params
	 * @return ʵ�弯��
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
			//���������
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
	 * ͨ�õĸ������ݿ����
	 * @param sql
	 * @param params
	 * @return ��Ӱ�������
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
