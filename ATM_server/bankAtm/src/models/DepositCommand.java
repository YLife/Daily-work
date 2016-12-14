package models;

public class DepositCommand extends Command {
	private String accountNo;
	private double money;

	public DepositCommand() {
	}

	public DepositCommand(String commandName, String accountNo, double money) {
		super(commandName);
		this.accountNo = accountNo;
		this.money = money;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
