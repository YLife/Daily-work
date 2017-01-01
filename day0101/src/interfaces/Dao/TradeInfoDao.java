package interfaces.Dao;

import java.util.List;

import entity.TradeInfo;

/**
 * �˽ӿڶ�TradeInfo�ĳ־û��������г���
 * @author YangLun
 *
 */
public interface TradeInfoDao extends BaseDao<TradeInfo> {
	
	/**
	 * ͨ�����Ų��¼
	 * @param cardId
	 * @return	List<TradeInfo>
	 */
	List<TradeInfo> queryByCardId(String cardId);
}
