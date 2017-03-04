package com.yl.test;

import java.util.List;

import org.junit.Test;

import com.yl.dao.CardDao;
import com.yl.entity.Card;

public class Test2 {
	private CardDao dao = new CardDao();
	@Test
	public void test() {
		List<Card> list = dao.queryAll();
		for (Card card : list) {
			System.out.println(card);
		}
	}
	
	@Test
	public void test2() {
		
	}

}
