package interfaces;

import java.util.List;

import entity.TradeInfo;

/**
 * �˽ӿڶ�TradeInfo�ĳ־û��������г���
 * @author Administrator
 *
 */

public interface TradeInfoDao extends BaseDao<TradeInfo> {
	
	List<TradeInfo> queryByCardId(String cardId);
	
}
