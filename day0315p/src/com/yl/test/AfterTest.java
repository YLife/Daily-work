package com.yl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.bean.IPerson;

public class AfterTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("after.xml");
		IPerson person = (IPerson) factory.getBean("proxy");
		person.eat();
	}
}
