package com.yl.entity;

public class People {
	private Integer pId;
	private String pName;
	private Card card;
	
	public People() {
		super();
	}

	public People(Integer pId, String pName, Card card) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.card = card;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
