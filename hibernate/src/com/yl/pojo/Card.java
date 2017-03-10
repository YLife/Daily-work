package com.yl.pojo;

public class Card {
	private Integer cardId;
	private String cardNo;
	private People people;
	
	public Card() {
		super();
	}

	public Card(Integer cardId, String cardNo, People people) {
		super();
		this.cardId = cardId;
		this.cardNo = cardNo;
		this.people = people;
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

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

}
