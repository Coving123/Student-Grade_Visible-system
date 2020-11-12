package com.learn.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testIoC {
   public static void main(String[] args) {
	      @SuppressWarnings("resource")
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	      UserDao ud = (UserDao) ac.getBean("userDao");
	      ud.say();
   }
  
}
