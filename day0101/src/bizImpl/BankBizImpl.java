package bizImpl;

import java.sql.Timestamp;
import java.util.Date;

import config.ApplicationConfig;
import entity.CardInfo;
import entity.TradeInfo;
import interfaces.Dao.CardInfoDao;
import interfaces.Dao.TradeInfoDao;
import biz.BankBiz;

public class BankBizImpl implements BankBiz {
	private CardInfoDao cid = ApplicationConfig.getCardInfoDao();
	private TradeInfoDao tid = ApplicationConfig.getTradeInfoDao();
	
	@Override
	public String findAccount(String cardId) {
		CardInfo ci = cid.queryById(cardId);
		if (ci == null) {
			return A;
		}
		return S;
	}

	@Override
	public String checkAccount(String cardId, String pwd) {
		CardInfo ci = cid.queryById(cardId);
		if (ci == null) {
			return A;
		}
		if (ci != null && !(ci.getPwd().equals(pwd))) {
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
	public String deposit(String cardId , double money) {
		CardInfo ci = cid.queryById(cardId);
		//�޸����
		ci.setBalance(ci.getBalance() + money);
		//���µ����ݿ�
		int row = cid.update(ci);
		//��ȡ���ʱ��
		Timestamp tt = new Timestamp(new Date().getTime());
		//�����׼�¼��ӵ����ݿ�
		row += tid.save(new TradeInfo(0 , cardId, TRADETYPE_DEPOSIT , tt, money, "deposit"));
		if (row == 2) {
			return S;
		}
		return E;
	}

	@Override
	public String withDraw(String cardId, double money) {
		CardInfo ci = cid.queryById(cardId);
		//��鵱ǰ����Ƿ��㹻ȡ��
		if (money > ci.getBalance()) {
			return B;
		}
		ci.setBalance(ci.getBalance() - money);
		int row = cid.update(ci);
		Timestamp tt = new Timestamp(new Date().getTime());
		row += tid.save(new TradeInfo(0, cardId, TRADETYPE_WITHDRAW, tt, money, "withDraw"));
		if (row == 2 ) {
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
		if (ci2.getBalance() < money) {
			return B;
		}
		//ת��
		ci2.setBalance(ci2.getBalance() - money);
		ci1.setBalance(ci1.getBalance() + money);
		int row = cid.update(ci2);
		row += cid.update(ci1);
		Timestamp tt = new Timestamp(new Date().getTime());
		row += tid.save(new TradeInfo(0, outCardId, TRADETYPE_WITHDRAW, tt, money, inCardId));
		row += tid.save(new TradeInfo(0, inCardId, TRADETYPE_DEPOSIT, tt, money, outCardId));
		if (row == 4) {
			return S;
		}
		return E;
	}

	@Override
	public String modifyPwd(String cardId, String oldPwd, String newPwd) {
		CardInfo ci = cid.queryById(cardId);
		if (ci.getPwd().equals(oldPwd)){
			ci.setPwd(newPwd);
			cid.update(ci);
			return S;
		}
		return E;
	}

}
