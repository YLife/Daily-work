package com.yl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yl.dao.QuestuionDao;
import com.yl.dao.ResultMapper;
import com.yl.entity.Question;

public class QuestionImpl extends BaseDao implements QuestuionDao {

	@Override
	public List<Question> queryAll() {
		String sql = "select * from question";
		return super.excuteQuery(sql, rm);
	}

	@Override
	public List<Question> queryBySubject(int subject) {
		String sql = "select * from question where subject = ?";
		return super.excuteQuery(sql, rm, subject);
	}

	@Override
	public int addQuestion(Question question) {
		String sql = "insert into question values(? , ? , ? , ? , ? , ? , ? , ?)";
		return super.excuteUpdate(sql, question.getQ_id() , question.getQuestion() , question.getOption_a() , question.getOption_b() , question.getOption_c() , question.getOption_d() , question.getSubject() , question.getAnswer());
	}
	
	ResultMapper<Question> rm = new ResultMapper<Question>() {
		
		@Override
		public Question resultMapping(ResultSet rs) {
			try {
				Question entity = new Question(rs.getInt("q_id"), rs.getString("question"), rs.getString("option_a"), rs.getString("option_b"), rs.getString("option_c"), rs.getString("option_d"), rs.getInt("subject"), rs.getString("answer"));
				return entity;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	};
}
