package bizImpl;

import java.sql.Timestamp;

import config.ApplicationContext;
import entity.CardInfo;
import entity.TradeInfo;
import interfaces.CardInfoDao;
import interfaces.TradeInfoDao;
import biz.BankBiz;

public class BankBizImpl implements BankBiz {
	
	//�²�ӿ�(������ϣ��仯��ֻ���޸������ļ�����)
	private CardInfoDao cid  = ApplicationContext.getCardInfoDao();//ֱ��new�赼��������������
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
		//��ѯ��Ӧ�˻�
		CardInfo cardInfo = cid.queryById(cardId);
		//�޸ĵ�ǰ�˻����
		cardInfo.setBalance(cardInfo.getBalance()+money);
		//���µ����ݿ⣨�־û���������Ӱ����У�
		int row = cid.update(cardInfo);
		//��ȡת��ʱ��
		Timestamp tt = new java.sql.Timestamp(new java.util.Date().getTime());
		//���ɽ��׼�¼
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_DEPOSITE, tt, money, "deposite");
		//���µ����ݿ�
		row += tid.save(tradeInfo); 
		return row == 2; 
	}

	@Override
	public boolean withDraw(String cardId, double money) {
		CardInfo cardInfo = cid.queryById(cardId);
		//��鵱ǰ����Ƿ��㹻ȡ��
		if (cardInfo.getBalance() < money) {
			return false;
		}
		cardInfo.setBalance(cardInfo.getBalance() - money);
		int row = cid.update(cardInfo);
		//��ȡȡ��ʱ��
		Timestamp tt = new java.sql.Timestamp(new java.util.Date().getTime());
		//���ɽ��׼�¼
		TradeInfo tradeInfo = new TradeInfo(0, cardId, TRADETYPE_WITHDRAW, tt, money, "withDraw");
		//�־û�
		row += tid.save(tradeInfo);
		return row == 2;
	}

	@Override
	public boolean trans(String aCardId, String bCardId, double money) {
		//��ѯb��
		CardInfo bCardInfo = cid.queryById(bCardId);
		//���b���Ƿ����
		if (bCardInfo == null) {
			return false ;
		}
		//��ѯa��
		CardInfo aCardInfo = cid.queryById(aCardId);
		//��ѯa������Ƿ��㹻
		if (aCardInfo.getBalance()<money) {
			return false ;
		}
		//ת��
		aCardInfo.setBalance(aCardInfo.getBalance() - money);
		bCardInfo.setBalance(bCardInfo.getBalance() + money);
		//�־û�
		int row = cid.update(aCardInfo);
		row += cid.update(bCardInfo);
		//��ȡ����ʱ��
		Timestamp tt = new java.sql.Timestamp(new java.util.Date().getTime());
		//���ɼ�¼
		TradeInfo aTradeInfo = new TradeInfo(0, aCardId, TRADETYPE_WITHDRAW, tt, money, bCardId);
		TradeInfo bTradeInfo = new TradeInfo(0, bCardId, TRADETYPE_DEPOSITE, tt, money, aCardId);
		//�־û�
		row += tid.save(aTradeInfo);
		row += tid.save(bTradeInfo);
		return row == 4 ;
	}

}
