package biz.impl;

import config.ApplicationContext;
import dao.CardInfoDao;
import dao.TradeInfoDao;
import entity.CardInfo;
import entity.TradeInfo;
import biz.BankBiz;

public class BankBizImpl implements BankBiz {

	// �²�ӿ�                                                    ������DriverManager.get......
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
		// �鵽��Ӧ�˻�
		CardInfo cardInfo = cid.queryById(cardId);
		// �޸������
		cardInfo.setBalance(cardInfo.getBalance() + money);
		// ���µ����ݿ�
		int row = cid.update(cardInfo);
		// ���ɽ��׼�¼
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_DEPOSIT,
				new java.sql.Timestamp(new java.util.Date().getTime()), money,
				null);
		// ���浽���ݿ�
		row += tid.save(tradeInfo);
		return row == 2;
	}

	@Override
	public boolean withDraw(String cardId, double money) {
		// �鵽��Ӧ�˻�
		CardInfo cardInfo = cid.queryById(cardId);
		// ������
		if (cardInfo.getBalance() < money) {
			return false;
		}
		// �������
		cardInfo.setBalance(cardInfo.getBalance() - money);
		// �־û�
		int row = cid.update(cardInfo);
		// ���ɽ��׼�¼
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_WITHDRAW,
				new java.sql.Timestamp(new java.util.Date().getTime()), money,
				null);
		row += tid.save(tradeInfo);
		return row == 2;
	}

	@Override
	public boolean trans(String aCardId, String bCardId, double money) {
		// ���ת�뷽����
		CardInfo b = cid.queryById(bCardId);
		if (b == null) {
			return false;
		}
		// ������
		CardInfo a = cid.queryById(aCardId);
		if (a.getBalance() < money) {
			return false;
		}
		// �������
		b.setBalance(b.getBalance() + money);
		a.setBalance(a.getBalance() - money);
		// �־û�
		int row = cid.update(b);
		row += cid.update(a);
		// ���ɽ��׼�¼
		java.sql.Timestamp tt = new java.sql.Timestamp(
				new java.util.Date().getTime());
		TradeInfo tradeInfoA = new TradeInfo(0, aCardId, TRADETYPE_WITHDRAW,
				tt, money, bCardId);
		TradeInfo tradeInfoB = new TradeInfo(0, bCardId, TRADETYPE_DEPOSIT, tt,
				money, aCardId);
		// �־û�
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
