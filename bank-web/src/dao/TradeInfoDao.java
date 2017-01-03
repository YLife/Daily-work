package dao;

import java.util.List;

import entity.TradeInfo;

public interface TradeInfoDao extends BaseDao<TradeInfo> {
	
	List<TradeInfo> queryByCardInfo(String cardId);
	
}
