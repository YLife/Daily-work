package com.yl.impl.dao;

import java.util.List;

import com.yl.dbUtil.BaseDao;
import com.yl.entity.ContactBook;
import com.yl.interfaes.dao.ContactDao;

public class ContactImpl extends BaseDao implements ContactDao {

	@Override
	public ContactBook queryById(int id) {
		String sql = "select * from contactBook where id = ?";
		List<ContactBook> list = super.excuteQuery(sql, id);
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public List<ContactBook> queryAll() {
		String sql = "select * from contactBook";
		List<ContactBook> list = super.excuteQuery(sql);
		return list;
	}

	@Override
	public int addConntact(ContactBook entity) {
		String sql = "insert into contactBook(contactId , contactName , contactPhone , contactMail , relation) values(? , ? , ? , ? , ?)";
		return super.excuteUpdate(sql, entity.getContactId() , entity.getContactName() , entity.getContactPhone() , entity.getContactMail() , entity.getRelation());
	}

	@Override
	public int updateContact(ContactBook entity) {
		String sql = "update contactBook set contactName = ? , contactPhone = ? , contactMail = ? , relation = ? where contactId = ?";
		return super.excuteUpdate(sql, entity.getContactName() , entity.getContactPhone() , entity.getContactMail() , entity.getRelation() , entity.getContactId());
	}

	@Override
	public int deleteContact(int id) {
		String sql = "delete from contactBook where contactId = ?";
		return super.excuteUpdate(sql, id);
	}

}
