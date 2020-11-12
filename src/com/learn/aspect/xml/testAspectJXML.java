package com.learn.aspect.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.JDK.UserDao;

public class testAspectJXML {
	
	public static void main(String[] args) {
		String path = "/com/learn/aspect/xml/aop.xml";
		@SuppressWarnings("resource")
		ApplicationContext ap =new ClassPathXmlApplicationContext(path);
		UserDao us = (UserDao) ap.getBean("userDao");
		us.add();
	}

}
