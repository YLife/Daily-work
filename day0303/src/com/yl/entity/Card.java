package com.yl.entity;

public class Card {
	private Integer cardId;
	private String cardNo;
	private People person;
	
	public Card() {
		super();
	}

	public Card(Integer cardId, String cardNo, People person) {
		super();
		this.cardId = cardId;
		this.cardNo = cardNo;
		this.person = person;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public People getPerson() {
		return person;
	}

	public void setPerson(People person) {
		this.person = person;
	}
}
