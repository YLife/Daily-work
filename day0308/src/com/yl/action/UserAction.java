package com.yl.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.yl.pojo.Goods;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int age ; 
	private Date date ;
	private String[] arr = new String[5];
	private Goods goods;
	
	public String execute(){
		System.out.println(age);
		System.out.println(date);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println(goods.getType() + ":" + goods.getPrice());
		return "success";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
}
