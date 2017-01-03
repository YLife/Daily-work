package biz.impl;

import config.ApplicationContext;
import dao.CardInfoDao;
import dao.TradeInfoDao;
import entity.CardInfo;
import entity.TradeInfo;
import biz.BankBiz;

public class BankBizImpl implements BankBiz {

	// 下层接口                                                    类似于DriverManager.get......
	private CardInfoDao cid = ApplicationContext.getCardInfoDao();
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
		return cardInfo != null && cardInfo.getPwd().equals(pwd);
	}

	@Override
	public double getBalance(String cardId) {
		return cid.queryById(cardId).getBalance();
	}

	@Override
	public boolean deposit(String cardId, double money) {
		// 查到对应账户
		CardInfo cardInfo = cid.queryById(cardId);
		// 修改其余额
		cardInfo.setBalance(cardInfo.getBalance() + money);
		// 更新到数据库
		int row = cid.update(cardInfo);
		// 生成交易记录
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_DEPOSIT,
				new java.sql.Timestamp(new java.util.Date().getTime()), money,
				null);
		// 保存到数据库
		row += tid.save(tradeInfo);
		return row == 2;
	}

	@Override
	public boolean withDraw(String cardId, double money) {
		// 查到对应账户
		CardInfo cardInfo = cid.queryById(cardId);
		// 检查余额
		if (cardInfo.getBalance() < money) {
			return false;
		}
		// 更新余额
		cardInfo.setBalance(cardInfo.getBalance() - money);
		// 持久化
		int row = cid.update(cardInfo);
		// 生成交易记录
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_WITHDRAW,
				new java.sql.Timestamp(new java.util.Date().getTime()), money,
				null);
		row += tid.save(tradeInfo);
		return row == 2;
	}

	@Override
	public boolean trans(String aCardId, String bCardId, double money) {
		// 检查转入方卡号
		CardInfo b = cid.queryById(bCardId);
		if (b == null) {
			return false;
		}
		// 检查余额
		CardInfo a = cid.queryById(aCardId);
		if (a.getBalance() < money) {
			return false;
		}
		// 更新余额
		b.setBalance(b.getBalance() + money);
		a.setBalance(a.getBalance() - money);
		// 持久化
		int row = cid.update(b);
		row += cid.update(a);
		// 生成交易记录
		java.sql.Timestamp tt = new java.sql.Timestamp(
				new java.util.Date().getTime());
		TradeInfo tradeInfoA = new TradeInfo(0, aCardId, TRADETYPE_WITHDRAW,
				tt, money, bCardId);
		TradeInfo tradeInfoB = new TradeInfo(0, bCardId, TRADETYPE_DEPOSIT, tt,
				money, aCardId);
		// 持久化
		row += tid.save(tradeInfoA);
		row += tid.save(tradeInfoB);
		return row == 4;
	}

	@Override
	public boolean findAccount(String cardId) {
		CardInfo c = cid.queryById(cardId);
		return c != null;
	}

}
