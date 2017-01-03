package dao.impl.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.EntityResultSetMapping;
import dao.TradeInfoDao;
import entity.TradeInfo;

public class TradeInfoDaoImpl extends DbUtil implements TradeInfoDao {

	private class TradeInfoResultSetMapping implements
			EntityResultSetMapping<TradeInfo> {

		@Override
		public TradeInfo mapping(ResultSet rs) throws SQLException {
			return new TradeInfo(rs.getInt("tradeId"), rs.getString("cardId"),
					rs.getInt("tradeType"), rs.getTimestamp("tradeDate"),
					rs.getDouble("tradeMoney"), rs.getString("remark"));

		}

	}

	@Override
	public TradeInfo queryById(Object id) {
		List<TradeInfo> list = super.executeQuery(
				new TradeInfoResultSetMapping(),
				"select * from tradeInfo where tradeId=?", id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<TradeInfo> queryAll() {
		return super.executeQuery(new TradeInfoResultSetMapping(),
				"select * from tradeInfo");
	}

	@Override
	public int save(TradeInfo entity) {
		String sql = "insert into tradeinfo (cardId, tradeType, tradeDate, tradeMoney, remark) values(?,?,?,?,?)";
		return super.executeUpdate(sql, entity.getCardId(),
				entity.getTradeType(), entity.getTradeDate(),
				entity.getTradeMoney(), entity.getRemark());
	}

	@Override
	public int del(Object id) {
		// TODO Auto-generated method stub
		return super
				.executeUpdate("delete from tradeinfo where tradeId-=?", id);
	}

	@Override
	public int update(TradeInfo entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TradeInfo> queryByCardInfo(String cardId) {
		String sql = "select * from tradeinfo where cardId=?";
		return super.executeQuery(new TradeInfoResultSetMapping(), sql, cardId);
	}

}
