package com.hwgk.atm.entity;

import java.sql.Timestamp;

public class TradeInfo {
	private int tradeId;
	private String cardId;
	private int tradeType;
	private java.sql.Timestamp tradeDate;
	private double tradeMoney;
	private String remark;
	
	public TradeInfo() {

	}

	public TradeInfo(int tradeId, String cardId, int tradeType,
					Timestamp tradeDate, double tradeMoney, String remark) {
		super();
		this.tradeId = tradeId;
		this.cardId = cardId;
		this.tradeType = tradeType;
		this.tradeDate = tradeDate;
		this.tradeMoney = tradeMoney;
		this.remark = remark;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public int getTradeType() {
		return tradeType;
	}

	public void setTradeType(int tradeType) {
		this.tradeType = tradeType;
	}

	public java.sql.Timestamp getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(java.sql.Timestamp tradeDate) {
		this.tradeDate = tradeDate;
	}

	public double getTradeMoney() {
		return tradeMoney;
	}

	public void setTradeMoney(double tradeMoney) {
		this.tradeMoney = tradeMoney;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
