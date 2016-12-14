package models;

public class WithDrawCommand extends CheckAccountCommand {
	private double money;

	public WithDrawCommand() {
		// TODO Auto-generated constructor stub
	}

	public WithDrawCommand(String commandName, String accountNo, String pwd,double money) {
		super(commandName, accountNo, pwd);
		this.money = money;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setMoney(double money) {
		this.money = money;
	}

}
