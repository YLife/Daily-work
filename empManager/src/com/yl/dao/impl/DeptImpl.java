package com.yl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yl.dao.DeptDao;
import com.yl.dao.ResultMapper;
import com.yl.entity.Dept;

public class DeptImpl extends BaseDao implements DeptDao {

	@Override
	public List<Dept> queryAll() {
		String sql = "select * from dept";
		return super.excuteQuery(sql, new ResultMapper<Dept>() {

			@Override
			public Dept resultMapping(ResultSet rs) {
				try {
					return new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
			}
		});
	}

}
