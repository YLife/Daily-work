package com.yl.interfaes.dao;

import java.util.List;

import com.yl.entity.ContactBook;

/**
 * 此接口对持久化操作进行抽象
 * @author Administrator
 *
 */
public interface ContactDao {
	/**
	 * 通过id查询联系人
	 * @param id
	 * @return 联系人
	 */
	ContactBook queryById(int id);
	
	/**
	 * 查询所有联系人
	 * @return 联系人集合
	 */
	List<ContactBook> queryAll();
	
	/**
	 * 添加联系人
	 * @param entity
	 * @return 受影响的行
	 */
	int addConntact(ContactBook entity);
	
	/**
	 * 修改联系人
	 * @param entity
	 * @return 受影响的行
	 */
	int updateContact(ContactBook entity);
	
	/**
	 * 删除联系人
	 * @param id
	 * @return 受影响的行
	 */
	int deleteContact(int id);
}
