package com.learn.bean;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean3 {

	public static void main(String[] args) {
		String path = "/com/learn/bean/bean3.xml";
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext(path);
		System.out.println(ap.getBean("bean3"));
	}
}
