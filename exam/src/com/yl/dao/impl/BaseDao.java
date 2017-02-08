package com.yl.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yl.dao.ResultMapper;

public class BaseDao {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?user=root&password=YL635901");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void close(ResultSet rs , Statement stmt , Connection conn){
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
	
	public <E> List<E> excuteQuery(String sql , ResultMapper<E> rm , Object...params){
		Connection conn = this.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<E> list = new ArrayList<E>();
		try {
			stmt = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
			}
			rs = stmt.executeQuery();
			//解析结果集
			while (rs.next()) {
				E entity = rm.resultMapping(rs);
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
