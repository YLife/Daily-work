package bizImpl;

import java.sql.Timestamp;

import config.ApplicationContext;
import entity.CardInfo;
import entity.TradeInfo;
import interfaces.CardInfoDao;
import interfaces.TradeInfoDao;
import biz.BankBiz;

public class BankBizImpl implements BankBiz {
	
	//下层接口(降低耦合，变化是只需修改配置文件即可)
	private CardInfoDao cid  = ApplicationContext.getCardInfoDao();//直接new需导入包，增大了耦合
	private TradeInfoDao tid = ApplicationContext.getTradeInfoDao();
	
	public void setCid(CardInfoDao cid) {
		this.cid = cid;
	}

	public void setTid(TradeInfoDao tid) {
		this.tid = tid;
	}

	@Override
	public boolean checkAccount(String cardId, String pwd) {
		CardInfo cardInfo = cid.queryById(cardId);
		return cardInfo != null && cardInfo.getPwd().equals(pwd) ;
	}

	@Override
	public double getBalance(String cardId) {
		return cid.queryById(cardId).getBalance();
	}

	@Override
	public boolean deposite(String cardId, double money) {
		//查询对应账户
		CardInfo cardInfo = cid.queryById(cardId);
		//修改当前账户余额
		cardInfo.setBalance(cardInfo.getBalance()+money);
		//更新到数据库（持久化，返回受影响的行）
		int row = cid.update(cardInfo);
		//获取转账时间
		Timestamp tt = new java.sql.Timestamp(new java.util.Date().getTime());
		//生成交易记录
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_DEPOSITE, tt, money, "deposite");
		//更新到数据库
		row += tid.save(tradeInfo); 
		return row == 2; 
	}

	@Override
	public boolean withDraw(String cardId, double money) {
		CardInfo cardInfo = cid.queryById(cardId);
		//检查当前余额是否足够取款
		if (cardInfo.getBalance() < money) {
			return false;
		}
		cardInfo.setBalance(cardInfo.getBalance() - money);
		int row = cid.update(cardInfo);
		//获取取款时间
		Timestamp tt = new java.sql.Timestamp(new java.util.Date().getTime());
		//生成交易记录
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_WITHDRAW, tt, money, "withDraw");
		//持久化
		row += tid.save(tradeInfo);
		return row == 2;
	}

	@Override
	public boolean trans(String aCardId, String bCardId, double money) {
		//查询b卡
		CardInfo bCardInfo = cid.queryById(bCardId);
		//检查b卡是否存在
		if (bCardInfo == null) {
			return false ;
		}
		//查询a卡
		CardInfo aCardInfo = cid.queryById(aCardId);
		//查询a卡余额是否足够
		if (aCardInfo.getBalance()<money) {
			return false ;
		}
		//转账
		aCardInfo.setBalance(aCardInfo.getBalance() - money);
		bCardInfo.setBalance(bCardInfo.getBalance() + money);
		//持久化
		int row = cid.update(aCardInfo);
		row += cid.update(bCardInfo);
		//获取交易时间
		Timestamp tt = new java.sql.Timestamp(new java.util.Date().getTime());
		//生成记录
		TradeInfo aTradeInfo = new TradeInfo(0, aCardId, TRADETYPE_WITHDRAW, tt, money, bCardId);
		TradeInfo bTradeInfo = new TradeInfo(0, bCardId, TRADETYPE_DEPOSITE, tt, money, aCardId);
		//持久化
		row += tid.save(aTradeInfo);
		row += tid.save(bTradeInfo);
		return row == 4 ;
	}

}
