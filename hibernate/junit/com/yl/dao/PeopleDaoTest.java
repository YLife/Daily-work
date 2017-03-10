package com.yl.dao;


import java.util.List;

import org.junit.Test;

import com.yl.pojo.Card;
import com.yl.pojo.People;

public class PeopleDaoTest {
	private PeopleDao dao = new PeopleDao();
	private CardDao cdao = new CardDao();
	@Test
	public void testList() {
		List<People> list = dao.queryList();
		for (People people : list) {
			System.out.println(people.getpName() + ":" + people.getCard().getCardNo());
		}
	}
	
	@Test
	public void testPeople(){
		People people = dao.queryById(10);
		System.out.println(people.getpName() + ":" + people.getCard().getCardNo());
	}
	
	@Test
	public void testSave(){
		People people = new People();
		Card card = new Card();
		people.setpName("cacaca");
		card.setCardNo("fqfdsaf");
		people.setCard(card);
		cdao.saveOrUpdate(card);
		dao.saveOrUpdate(people);
	}
	
	@Test
	public void testDel(){
		People people = dao.queryById(10);
		dao.del(people);
		/*Card card = cdao.queryById(9);
		cdao.del(card);*/
	}
	
	@Test
	public void testRemove(){
		dao.remove(11);
	}
	
	
	
	

}
