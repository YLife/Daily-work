package models;

/**
 * 账户信息类
 * @author Administrator
 *
 */
public class Account {
	private String accountNo;
	private String pwd;
	private double balance;

	public Account() {
		
	}

	public Account(String accountNo, String pwd, double balance) {
		super();
		this.accountNo = accountNo;
		this.pwd = pwd;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
