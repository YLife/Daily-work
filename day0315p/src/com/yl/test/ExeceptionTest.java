package com.yl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yl.bean.IPerson;

public class ExeceptionTest {
	
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("exeception.xml");
		IPerson person = (IPerson) factory.getBean("target");
		person.eat();
	}
}	
