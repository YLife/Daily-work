package com.yl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yl.dao.MindDao;
import com.yl.dao.ResultMapper;
import com.yl.entity.Mind;

public class MindImpl extends BaseDao implements MindDao {
	
	@Override
	public List<Mind> queryAll() {
		String sql = "select * from mind";
		List<Mind> list = super.excuteQuery(sql, rm);
		return list;
	}

	@Override
	public Mind queryById(int id) {
		String sql = "select * from mind where id = ?";
		List<Mind> list = super.excuteQuery(sql, rm, id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public int update(Mind entity) {
		String sql = "update mind set title = ? , content = ? , writeDate = ? where id = ?";
		return super.excuteUpdate(sql, entity.getTitle() , entity.getContent() , entity.getWriteDate() , entity.getId());
	}
	
	ResultMapper<Mind> rm = new ResultMapper<Mind>() {
		
		@Override
		public Mind resultMapping(ResultSet rs) {
			try {
				return new Mind(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getDate("writeDate"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	};
}
