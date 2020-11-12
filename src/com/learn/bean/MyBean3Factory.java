package com.learn.bean;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class MyBean3Factory {

	public MyBean3Factory() {
		System.out.println("constructoring...");
		
	}
	
	public Bean3 createBean() {
		return new Bean3();
	}
}
