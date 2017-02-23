package com.yl.biz;

import java.util.List;

import com.yl.dao.ContactDao;
import com.yl.entity.Contact;
import com.yl.entity.Relation;

/**
 * ÒµÎñ²ã
 * @author Mr.Yang
 *
 */
public class ContactBiz {
	private ContactDao dao = new ContactDao();
	public List<Contact> findContacts(int currentPage , int pageSize){
		return dao.queryContacts(currentPage, pageSize);
	}
	
	public Contact findContact(int id){
		return dao.queryById(id);
	}
	
	public void delContact(Contact contact){
		dao.removeContact(contact);
	}
	
	public int getTotalPage(int pageSize){
		return (dao.getCount() - 1) / pageSize + 1;
	}
	
	public void saveContact(Contact contact , Relation relation){
		dao.save(contact, relation);
	}
}
