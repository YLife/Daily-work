package interfaces;

import java.util.List;

import entity.TradeInfo;

/**
 * 此接口对TradeInfo的持久化操作进行抽象
 * @author Administrator
 *
 */

public interface TradeInfoDao extends BaseDao<TradeInfo> {
	
	List<TradeInfo> queryByCardId(String cardId);
	
}
