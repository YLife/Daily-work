package com.yl.bean;

public class Person implements IPerson {

	@Override
	public void eat() {
		System.out.println("�Է���...");
		System.out.println(3/0);
	}

}
