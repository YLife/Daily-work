package com.yl.test;


import java.util.List;

import com.yl.dao.PeopleDao;
import com.yl.entity.Card;
import com.yl.entity.People;

public class Test {
	private PeopleDao dao = new PeopleDao();
	@org.junit.Test
	public void test() {
		List<People> list = dao.queryAll();
		for (People person : list) {
			System.out.println(person.getpName() + ":" + person.getCard().getCardNo());
		}
	}
	
	@org.junit.Test
	public void test2() {
		Card card = new Card();
		card.setCardId(1);
		card.setCardNo("111111111111");
		People people = new People();
		people.setpId(5);
		people.setpName("sbbbbbbbb");
		people.setCard(card);
		dao.save(people , card);
	}

}
