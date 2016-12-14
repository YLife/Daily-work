package interfaces;

import models.Account;

public interface IAccountBiz {
	// 一些状态码
	int SUCCESS = 0;
	int PWD_ERROR = 1;
	int BALANCE_WARN = 2;
	int ACCOUNT_NOT_EXISTS = 3;
	
	/**
	 * 查找指定账户 
	 * @param accountNo 账号
	 * @return if accountNo not exists, return null
	 */
	Account findAccount(String accountNo);
	
	/**
	 * 检查账号和密码的正确性
	 * @param accountNo 账号 
	 * @param pwd 密码
	 * @return 状态码
	 */
	int checkAccount(String accountNo, String pwd);
	
	/**
	 * 查指定账户的余额
	 * @param accountNo 账号
	 * @return 余额
	 */
	double queryBalance(String accountNo);
	
	/**
	 * 指定的账户取款
	 * @param accountNo 账号
	 * @param pwd 密码
	 * @param money 取款金额
	 * @return 状态码
	 */
	int withDraw(String accountNo, String pwd, double money);
	
	/**
	 * 指定的账户存款
	 * @param accountNo 账号
	 * @param money 密码
	 * @return 状态码
	 */
	int deposit(String accountNo, double money);
}
