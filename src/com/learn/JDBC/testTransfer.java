package com.learn.JDBC;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testTransfer {

	@Test
	public void testtransfer() {
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dao us = (Dao) ap.getBean("dao");
		us.transfer("YD", "YP", 200.00);
		System.out.println("transfer succeed!");
	}
	
	@Test
	public void testAnno() {
		String sql = "/com/learn/JDBC/applicationContext-annotation.xml";
		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext(sql);
		Dao us = (Dao) ap.getBean("dao");
		us.transfer("YP", "YD", 500.00);
		System.out.println("transfer succeed!");
	}
	
}
