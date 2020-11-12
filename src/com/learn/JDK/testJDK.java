package com.learn.JDK;

public class testJDK {

	public static void main(String[] args) {
		
		JdkProxy pro = new JdkProxy();
		UserDao userDao = new DaoImpl();
		UserDao us = (UserDao) pro.createProxy(userDao);
		
		us.add();
		us.sub();
		
	}
}
