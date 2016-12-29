package request;

/**
 * 客户端请求
 * @author Administrator
 *
 */
public interface BankRequest {
	
	/**
	 * 查找账户是否存在
	 * @param cardId
	 * @return
	 */
	boolean findAccount(String cardId);
	
	/**
	 * 校验账户信息是否正确
	 * @param cardId
	 * @param pwd
	 * @return
	 */
	boolean checkAccount(String cardId , String pwd);
	
	/**
	 * 查询余额
	 * @param card
	 * @return
	 */
	double getBalance(String cardId);
	
	/**
	 * 存款
	 * @param cardId
	 * @param money
	 * @return
	 */
	boolean deposit(String cardId , double money);
	
	/**
	 * 取款
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
	boolean trans(String outCardId , String inCardId , double money);
}
