package com.yl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.bean.IPerson;

public class AopTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("aop.xml");
		IPerson person = (IPerson) factory.getBean("target");
		person.eat();
	}
}
