package impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import interfaces.CardInfoDao;
import interfaces.EntityResultSetMapping;
import dbUtil.DbUtil;
import entity.CardInfo;

public class CardInfoImpl extends DbUtil implements CardInfoDao{
	
	//ÄÚ²¿Àà
	private class CardInfoResultSetMappingImpl implements EntityResultSetMapping<CardInfo>{

		@Override
		public CardInfo mapping(ResultSet rs) throws SQLException {
			return new CardInfo(rs.getString("cardId"), rs.getString("pwd"), rs.getDouble("balance"));
		}
	}
	
	@Override
	public CardInfo queryById(Object id) {
		String sql = "select * from cardInfo where cardId = ?";
		List<CardInfo> list = super.excuteQuery(new CardInfoResultSetMappingImpl(), sql, id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<CardInfo> queryAll() {
		String sql = "select * from cardInfo;";
		List<CardInfo> list = super.excuteQuery(new CardInfoResultSetMappingImpl(), sql);
		return list;
	}

	@Override
	public int save(CardInfo entity) {
		String sql = "insert into cardInfo(cardId,pwd,balance) values(?,?,?)";
		return super.excuteUpdate(sql, entity.getCardId(),entity.getPwd(),entity.getBalance());
	}

	@Override
	public int del(Object id) {
		String sql = "delete from cardInfo  where cardId = ?";
		return super.excuteUpdate(sql, id);
	}

	@Override
	public int update(CardInfo entity) {
		String sql = "update cardInfo set pwd=?,balance=? where cardId = ? ";
		return super.excuteUpdate(sql, entity.getPwd(),entity.getBalance(),entity.getCardId());
	}

}
