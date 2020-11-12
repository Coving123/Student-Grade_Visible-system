package com.learn.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.JDK.UserDao;

public class testProxyBean {

	public static void main(String[] args) {
		
		String path = "com/learn/factorybean/BeanContext.xml";
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext(path);
		UserDao us = (UserDao) ap.getBean("daoProxy");
		
		us.add();
		us.sub();
	
	}
}
