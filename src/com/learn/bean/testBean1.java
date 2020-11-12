package com.learn.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean1 {


	public static void main(String[] args) {
		String path = "/com/learn/bean/bean1.xml";
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext(path);
		Bean1 bean = (Bean1) ap.getBean("bean1");
		System.out.println(bean);
	}
}
