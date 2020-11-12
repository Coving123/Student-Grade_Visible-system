package com.learn.aspect.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect{

	public void before(JoinPoint jp) {
		
		System.out.println("before alert:checking permissions...");
		System.out.print("find target:"+jp.getTarget());
		System.out.println(",target method be weavered strengthen is:"+jp.getSignature().getName());

	}
	
	public void after(JoinPoint jp) {
		
		System.out.print("after alert:logging...");
		System.out.println(",target method be weavered strengthen is:"+ jp.getSignature().getName());
	
	}
	
//	around
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("inti alert:start transaction before excute object method...");
		Object obj = pjp.proceed();
		System.out.println("end alert:close transaction after excute object method...");
		return obj;
		
	}
	
	public void afterThrowing(JoinPoint jp,Throwable e) {
		
		System.out.println("thread throw an alert:ERROR in "+e.getMessage());
		
	}
	
	public void finalAlert() {
		System.out.println("alert:release resourse after all method be done!");
	}
}
