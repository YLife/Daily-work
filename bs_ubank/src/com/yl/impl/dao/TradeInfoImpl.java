package com.yl.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yl.dbUtil.DbUtil;
import com.yl.entity.TradeInfo;
import com.yl.interfaces.dao.ResultMapper;
import com.yl.interfaces.dao.TradeInfoDao;

public class TradeInfoImpl extends DbUtil implements TradeInfoDao {
	//ÄÚ²¿Àà
	private class ResultMapperImpl implements ResultMapper<TradeInfo>{

		@Override
		public TradeInfo resultMapping(ResultSet rs) throws SQLException {
			return new TradeInfo(rs.getInt("TradeId"), rs.getString("cardId"), rs.getInt("tradeType"), rs.getTimestamp("TradeDate"), rs.getDouble("money"), rs.getString("remark"));
		}
	}
	
	@Override
	public TradeInfo queryById(Object id) {
		String sql = "select * from TradeInfo where tradeId = ?";
		List<TradeInfo> list = super.excuteQuery(sql, new ResultMapperImpl(), id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<TradeInfo> queryAll() {
		String sql = "select * from TradeInfo";
		List<TradeInfo> list = super.excuteQuery(sql, new ResultMapperImpl());
		return list;
	}

	@Override
	public int add(TradeInfo entity) {
		String sql = "insert into TradeInfo(tradeId , cardId , tradeType , tradeDate , tradeMoney , remark) values(? , ? , ? , ? , ? , ?)";
		return super.excuteUpdate(sql, entity.getTradeId() , entity.getCardId() , entity.getTradeType() , entity.getTradeDate() , entity.getTradeMoney() , entity.getRemark());
	}

	@Override
	public int delete(Object id) {
		String sql = "delete from TradeInfo where tradeId = ?";
		return super.excuteUpdate(sql, id);
	}

	@Override
	public int update(TradeInfo entity) {
		String sql = "update TradeInfo set cardId = ? , tradeType = ? , tradeDate = ? , tradeMoney = ? , remark = ? where tradeId = ?";
		return super.excuteUpdate(sql, entity.getCardId() , entity.getTradeType() , entity.getTradeDate() , entity.getTradeMoney() , entity.getRemark() , entity.getTradeId());
	}

}
