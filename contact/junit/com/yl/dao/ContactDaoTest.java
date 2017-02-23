package com.yl.dao;


import java.util.List;

import org.junit.Test;

import com.yl.entity.Contact;
import com.yl.entity.Relation;

public class ContactDaoTest {
	private ContactDao dao = new ContactDao();
	@Test
	public void testQueryContacts() {
		List<Contact> list = dao.queryContacts( 1, 1);
		for (Contact contact : list) {
			System.out.println(contact.getContactName());
		}
	}
	
	@Test
	public void testQueryById(){
		Contact contact = dao.queryById(1);
		System.out.println(contact.getContactName());
	}
	
	@Test
	public void testGetCount(){
		System.out.println(dao.getCount());
	}
	
	@Test
	public void testSave(){
		Relation relation = new Relation();
		relation.setRelationName("sb");
		Contact contact = new Contact();
		contact.setContactName("sb");
		contact.setContactPhone("119");
		contact.setContactMail("119@qq.com");
		contact.setRelation(relation);
		dao.save(contact , relation);
	}
}
