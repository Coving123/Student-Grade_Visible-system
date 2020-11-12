package com.learn.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAnnotation {

	public static void main(String[] args) {
		String path = "/com/learn/annotation/bean6.xml";
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext(path);
		UserController us = (UserController) ap.getBean("userController");
		us.Do();
	}
}
