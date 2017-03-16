package com.yl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.bean.IPerson;

public class AroundTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("around.xml");
		IPerson person = (IPerson) factory .getBean("proxy");
		person.eat();
	}
}
