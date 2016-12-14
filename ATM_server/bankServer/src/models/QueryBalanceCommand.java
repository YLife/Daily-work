package models;

public class QueryBalanceCommand extends Command {
	private String accountNo;

	public QueryBalanceCommand() {
		// TODO Auto-generated constructor stub
	}

	public QueryBalanceCommand(String commandName, String accountNo) {
		super(commandName);
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

}
