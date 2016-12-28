package biz;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface BankBiz {
	
	//常量，交易
	int TRADETYPE_DEPOSITE = 1;
	int TRADETYPE_WITHDRAW = 2;
	
	/**
	 * 检查账户是否存在
	 * @param cardId
	 * @param pwd
	 * @return 
	 */
	boolean checkAccount(String cardId , String pwd);
	
	/**
	 * 查询余额
	 * @param cardId
	 * @return 
	 */
	double getBalance(String cardId);
	
	/**
	 * 存钱
	 * @param cardId
	 * @param money
	 * @return
	 */
	boolean deposite(String cardId , double money);
	
	/**
	 * 取钱
	 * @param cardId
	 * @param money
	 * @return
	 */
	boolean withDraw(String cardId , double money);
	
	/**
	 * 转账
	 * @param aCardId
	 * @param bCardId
	 * @param money
	 * @return
	 */
	boolean trans(String aCardId , String bCardId , double money);
}
