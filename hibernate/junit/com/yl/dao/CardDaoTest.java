package com.yl.dao;


import java.util.List;

import org.junit.Test;

import com.yl.pojo.Card;

public class CardDaoTest {
	private CardDao dao = new CardDao();
	
	@Test
	public void test() {
		List<Card> list = dao.queryList();
		for (Card card : list) {
			System.out.println(card.getCardNo() + ":" + card.getPeople());
		}
	}
	
	@Test
	public void testCard(){
		Card card = dao.queryById(5);
		System.out.println(card.getCardNo() + ":" + card.getPeople().getpName());
	}

}
