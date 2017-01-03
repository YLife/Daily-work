package entity;

/*
 * 实体类： 账户
 */
public class CardInfo {
	private String cardId;
	private String pwd;
	private double balance;

	public CardInfo() {
		// TODO Auto-generated constructor stub
	}

	public CardInfo(String cardId, String pwd, double balance) {
		super();
		this.cardId = cardId;
		this.pwd = pwd;
		this.balance = balance;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
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
