package com.yl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.bean.IPerson;

public class BeforeTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPerson person = (IPerson) factory.getBean("target");
		person.eat();
	}
}
