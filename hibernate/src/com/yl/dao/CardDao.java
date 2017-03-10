package com.yl.dao;

import java.util.List;

import com.yl.pojo.Card;

public class CardDao extends BaseDao<Card> {
	
	public List<Card> queryList(){
		String hql = "select c from Card c left join fetch c.people ";
		return super.queryList(hql);
	}
	
	public Card queryById(Integer id){
		String hql = "select c from Card c left join c.people p where c.cardId = ?";
		return super.queryById(hql, id);
	}
	
	public void saveOrUpdate(Card card){
		super.saveOrUpdate(card);
	}
	
	public void del(Card card){
		super.del(card);
	}
	
	public void remove(Integer id){
		String hql = "delete from Card c where c.cardId = ?";
		super.remove(hql, id);
	}
}
