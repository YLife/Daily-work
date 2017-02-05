package com.yl.impl.biz;

import java.sql.Timestamp;
import java.util.Date;

import com.yl.entity.CardInfo;
import com.yl.entity.TradeInfo;
import com.yl.impl.dao.CardInfoImpl;
import com.yl.impl.dao.TradeInfoImpl;
import com.yl.interfaces.biz.BankBiz;
import com.yl.interfaces.dao.CardInfoDao;
import com.yl.interfaces.dao.TradeInfoDao;

public class BankBizImpl implements BankBiz {
	CardInfoDao cid = new CardInfoImpl();
	TradeInfoDao tid = new TradeInfoImpl();
	@Override
	public String findAccount(String cardId) {
		CardInfo ci = cid.queryById(cardId);
		if (ci != null) {
			return S;
		}
		return A;
	}

	@Override
	public String checkAcccount(String cardId, String pwd) {
		CardInfo ci = cid.queryById(cardId);
		if (ci == null) {
			return A;
		}
		if (!pwd.equals(ci.getPwd())) {
			return P;
		}
		return S;
	}

	@Override
	public double getBalance(String cardId) {
		double balance = cid.queryById(cardId).getBalance();
		return balance;
	}

	@Override
	public String deposit(String cardId, double money) {
		CardInfo ci = cid.queryById(cardId);
		//修改账户余额
		ci.setBalance(ci.getBalance() + money);
		//进行持久化
		int row = cid.update(ci);
		//获取当前操作时间
		Timestamp tt = new Timestamp(new Date().getTime());
		//将交易记录添加到数据库
		row += tid.add(new TradeInfo(0 , cardId, TRADETYPE_DEPOSIT, tt, money, "deposit"));
		if (row == 2) {
			return S;
		}
		return E;
	}

	@Override
	public String withDraw(String cardId, double money) {
		CardInfo ci = cid.queryById(cardId);
		if (money > ci.getBalance()) {
			return B;
		}
		ci.setBalance(ci.getBalance() - money);
		int row = cid.update(ci);
		Timestamp tt = new Timestamp(new Date().getTime());
		row += tid.add(new TradeInfo(0, cardId, TRADETYPE_WITHDRAW, tt, money, "withdraw"));
		if (row == 2) {
			return S;
		}
		return E;
	}

	@Override
	public String trans(String outCardId, String inCardId, double money) {
		CardInfo ci1 = cid.queryById(inCardId);
		if (ci1 == null) {
			return A;
		}
		CardInfo ci2 = cid.queryById(outCardId);
		if (money > ci2.getBalance()) {
			return B;
		}
		ci2.setBalance(ci2.getBalance() - money);
		ci1.setBalance(ci1.getBalance() + money);
		int row = cid.update(ci2);
		row += cid.update(ci1);
		Timestamp tt = new Timestamp(new Date().getTime());
		row += tid.add(new TradeInfo(0, outCardId, TRADETYPE_WITHDRAW, tt, money, inCardId));
		row += tid.add(new TradeInfo(0, inCardId, TRADETYPE_DEPOSIT, tt, money, outCardId));
		if (row == 4) {
			return S;
		}
		return E;
	}

	@Override
	public String modifyPwd(String cardId, String oldPwd, String newPwd) {
		CardInfo ci = cid.queryById(cardId);
		if (oldPwd.equals(ci.getPwd())) {
			ci.setPwd(newPwd);
			cid.update(ci);
			return S;
		}
		return E;
	}

}
