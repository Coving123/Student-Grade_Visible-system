package com.learn.bean;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean2 {

	public static void main(String[] args) {
		String path = "/com/learn/bean/bean2.xml";
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext(path);
		System.out.println(ap.getBean("bean2"));
	}
}
