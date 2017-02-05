package com.yl.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yl.dbUtil.DbUtil;
import com.yl.entity.CardInfo;
import com.yl.interfaces.dao.CardInfoDao;
import com.yl.interfaces.dao.ResultMapper;

public class CardInfoImpl extends DbUtil implements CardInfoDao {
	//匿名内部类
	ResultMapper<CardInfo> rmCard = new ResultMapper<CardInfo>() {
		
		@Override
		public CardInfo resultMapping(ResultSet rs) throws SQLException {
			return new CardInfo(rs.getString("cardId"), rs.getString("pwd"), rs.getDouble("balance"));
		}
	};
	
	@Override
	public CardInfo queryById(Object id) {
		String sql = "select * from CardInfo where cardId = ?";
		List<CardInfo> list = super.excuteQuery(sql, rmCard, id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<CardInfo> queryAll() {
		String sql = "select * from CardInfo";
		List<CardInfo> list = super.excuteQuery(sql, rmCard);
		return list;
	}

	@Override
	public int add(CardInfo entity) {
		String sql = "insert into CardInfo(cardId , pwd , money) values(? , ? , ?)";
		return super.excuteUpdate(sql, entity.getCardId() , entity.getPwd() ,entity.getBalance());
	}

	@Override
	public int delete(Object id) {
		String sql = "delete from CardInfo where cardId = ?";
		return super.excuteUpdate(sql, id);
	}

	@Override
	public int update(CardInfo entity) {
		String sql = "update CardInfo set pwd = ? , balance = ? where cardId = ?";
		return super.excuteUpdate(sql, entity.getPwd() , entity.getBalance() , entity.getCardId());
	}

}
