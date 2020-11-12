package com.learn.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	
	@Override
	public Object invoke(MethodInvocation args) throws Throwable {
		// TODO Auto-generated method stub
		check();
		Object obj = args.proceed();
		log();
		return obj;
	}

	private void log() {
		// TODO Auto-generated method stub
		System.out.println("logging...");
	}

	private void check() {
		// TODO Auto-generated method stub
		System.out.println("checking Permissions...");
	}

}
