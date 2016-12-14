package models;

/**
 * ��ATM�ϲ��뿨Ƭ��������ʱ, ATM����������͵�ָ��
 * 
 * @author Administrator
 * 
 */
public class CheckAccountCommand extends Command {
	private String accountNo;
	private String pwd;

	public CheckAccountCommand() {
	}

	public CheckAccountCommand(String commandName, String accountNo, String pwd) {
		super(commandName);
		this.accountNo = accountNo;
		this.pwd = pwd;
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

}
