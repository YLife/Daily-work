package biz;

public interface BankBiz {
	
	// 常量： 交易类型
	int TRADETYPE_DEPOSIT = 1;
	int TRADETYPE_WITHDRAW = 2;
	
	boolean findAccount(String cardId);
	
	boolean checkAccount(String cardId, String pwd);
	
	double getBalance(String cardId);
	
	boolean deposit(String cardId, double money);
	
	boolean withDraw(String cardId, double money);
	
	boolean trans(String aCardId, String bCardId, double money);
	
}
