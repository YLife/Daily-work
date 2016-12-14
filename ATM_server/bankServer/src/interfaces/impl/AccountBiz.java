package interfaces.impl;

import interfaces.IAccountBiz;

import java.util.HashMap;
import java.util.Map;

import models.Account;

/**
 * 业务类, 封装账户查找, 收入支出等操作
 * 
 * @author Administrator
 * 
 */
public class AccountBiz implements IAccountBiz {
	// 模拟银行账户信息数据库
	static Map<String, Account> data = new HashMap<String, Account>();
	
	static {
		data.put("000", new Account("000", "000", 3000445));
		data.put("111", new Account("111", "111", 46722));
		data.put("222", new Account("222", "222", 675435));
		data.put("333", new Account("333", "333", 243253));
		data.put("444", new Account("444", "444", 80989856));
		data.put("555", new Account("555", "555", 46457657));
		data.put("666", new Account("666", "666", 14235456));
		data.put("777", new Account("777", "777", 35436987));
	}

	@Override
	public Account findAccount(String accountNo) {
		return data.get(accountNo);
	}

	@Override
	public int checkAccount(String accountNo, String pwd) {
		Account ac = this.findAccount(accountNo);
		if (ac == null)
			return ACCOUNT_NOT_EXISTS;
		if (!pwd.equals(ac.getPwd()))
			return PWD_ERROR;
		return SUCCESS;
	}

	@Override
	public double queryBalance(String accountNo) {
		return this.findAccount(accountNo).getBalance();
	}

	@Override
	public int withDraw(String accountNo, String pwd, double money) {
		if (checkAccount(accountNo, pwd)==1&&money<=queryBalance(accountNo)) {
			Account ac = this.findAccount(accountNo);
			ac.setBalance(ac.getBalance()-money);
			return SUCCESS;
		}else if (findAccount(accountNo)==null) {
			return ACCOUNT_NOT_EXISTS;
		}else if (checkAccount(accountNo, pwd)!=SUCCESS) {
			return PWD_ERROR;
		}
		return BALANCE_WARN;
	}

	@Override
	public int deposit(String account, double money) {
		Account ac = this.findAccount(account);
		if (ac==null) {
			return ACCOUNT_NOT_EXISTS;
		}
		ac.setBalance(ac.getBalance()+money);
		return SUCCESS;
	}

}
