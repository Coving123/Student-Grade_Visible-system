package com.learn.aspect.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAspectJannotation {

	public static void main(String[] args) {
		String path = "/com/learn/aspect/annotation/aop.xml";
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext(path);
		UserDao us = (UserDao) ap.getBean("userDao");
		us.add();
	}
}
