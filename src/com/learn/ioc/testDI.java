package com.learn.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDI {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.Do();
	}
}
