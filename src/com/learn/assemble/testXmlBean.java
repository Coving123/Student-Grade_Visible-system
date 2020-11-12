package com.learn.assemble;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testXmlBean {
	public static void main(String[] args) {
		String path = "com/learn/assemble/bean5.xml";
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext(path);
		System.out.println(ap.getBean("user1"));
		System.out.println(ap.getBean("user2"));
	}
}
