package dao.impl.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.CardInfoDao;
import dao.EntityResultSetMapping;
import entity.CardInfo;

public class CardInfoDaoImpl extends DbUtil implements CardInfoDao {

	// 这是一个内部类（inner class)
	private class CardInfoResultSetMappingImpl implements
			EntityResultSetMapping<CardInfo> {

		@Override
		public CardInfo mapping(ResultSet rs) throws SQLException {
			return new CardInfo(rs.getString("cardId"), rs.getString("pwd"),
					rs.getDouble("balance"));
		}

	}

	@Override
	public CardInfo queryById(Object id) {
		String sql = "select * from cardInfo where cardId=?";
		List<CardInfo> list = super.executeQuery(
				new CardInfoResultSetMappingImpl(), sql, id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<CardInfo> queryAll() {
		String sql = "select * from cardinfo";
		return super.executeQuery(new CardInfoResultSetMappingImpl(), sql);
	}

	@Override
	public int save(CardInfo entity) {
		String sql = "insert into cardInfo(cardId,pwd,balance) values(?,?,?)";
		return super.executeUpdate(sql, entity.getCardId(), entity.getPwd(),
				entity.getBalance());
	}

	@Override
	public int del(Object id) {
		String sql = "delete from cardInfo where cardId=?";
		return super.executeUpdate(sql, id);
	}

	@Override
	public int update(CardInfo entity) {
		String sql = "update cardinfo set pwd=?, balance=? where cardId=?";
		return super.executeUpdate(sql, entity.getPwd(), entity.getBalance(),
				entity.getCardId());
	}

}
