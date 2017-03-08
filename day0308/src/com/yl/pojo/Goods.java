package com.yl.pojo;

public class Goods {
	
	private String type;
	private int price;
	
	public Goods() {
		super();
	}

	public Goods(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
