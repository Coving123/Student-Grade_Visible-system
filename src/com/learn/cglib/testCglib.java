package com.learn.cglib;

public class testCglib {
	public static void main(String[] args) {
		CglibProxy cg = new CglibProxy();
		User user = new User();
		User us = (User) cg.createProxy(user);
		
		us.add();
		us.sub();
	
	}

}
