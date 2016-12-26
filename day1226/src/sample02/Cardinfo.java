package sample02;

public class Cardinfo {
	private String cardId;
	private String pwd;
	private double balance;
	
	public Cardinfo() {
		
	}

	public Cardinfo(String cardId, String pwd, double balance) {
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
	
	public String toString() {
		return this.getCardId()+" , "+this.getPwd()+" , "+this.getBalance();
	}
}
