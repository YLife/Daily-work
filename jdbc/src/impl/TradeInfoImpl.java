package impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import interfaces.EntityResultSetMapping;
import interfaces.TradeInfoDao;
import dbUtil.DbUtil;
import entity.TradeInfo;

public class TradeInfoImpl extends DbUtil implements TradeInfoDao {
	
	//ÄÚ²¿Àà
	private class TradeInfoResultSetMappingImpl implements EntityResultSetMapping<TradeInfo>{

		@Override
		public TradeInfo mapping(ResultSet rs) throws SQLException {
			return new TradeInfo(rs.getInt("tradeId"), rs.getString("cardId"), rs.getInt("tradeType"), rs.getTimestamp("tradeDate"), rs.getDouble("tradeMoney"), rs.getString("remark"));
		}
		
	}
	
	@Override
	public TradeInfo queryById(Object id) {
		String sql = "select * from tradeInfo where tradeId = ?";
		List<TradeInfo> list = super.excuteQuery(new TradeInfoResultSetMappingImpl(), sql, id);
		return list.size()>0 ? list.get(0) : null;
	}

	@Override
	public List<TradeInfo> queryByCardId(String cardId) {
		String sql = "select * from tradeInfo where cardId = ?";
		List<TradeInfo> list = super.excuteQuery(new TradeInfoResultSetMappingImpl(), sql, cardId);
		return list;
	}
	
	@Override
	public List<TradeInfo> queryAll() {
		String sql = "select * from tradeInfo";
		List<TradeInfo> list = super.excuteQuery(new TradeInfoResultSetMappingImpl(), sql);
		return list;
	}

	
	@Override
	public int save(TradeInfo entity) {
		String sql = "insert into tradeInfo(tradeId,CardId,tradeType,tradeDate,tradeMoney,remark)"
				+ " values(?,?,?,?,?,?)";
		return super.excuteUpdate(sql, entity.getTradeId(),entity.getCardId(),entity.getTradeType(),
				entity.getTradeDate(),entity.getTradeMoney(),entity.getRemark());
	}

	@Override
	public int del(Object id) {
		String sql = "delete from tradeInfo where tradeId = ?";
		return super.excuteUpdate(sql, id);
	}

	@Override
	public int update(TradeInfo entity) {
		String sql = "update tradeInfo set cardId=?,tradeType=?,tradeDate=?,tradeMoney=?,remark=?"
				+ " where tradeId = ?";
		return super.excuteUpdate(sql, entity.getCardId(),entity.getTradeType(),entity.getTradeDate(),
				entity.getTradeMoney(),entity.getRemark(),entity.getTradeId());
	}

	

}
