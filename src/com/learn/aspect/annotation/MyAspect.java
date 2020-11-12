package com.learn.aspect.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect{

	@Pointcut("execution(* com.learn.aspect.annotation.*.*(..))")
	private void pointCut() {}
	
	@Before("pointCut()")
	public void before(JoinPoint jp) {
		
		System.out.println("before alert:checking permissions...");
		System.out.print("find target:"+jp.getTarget());
		System.out.println(",target method be weavered strengthen is:"+jp.getSignature().getName());

	}
	
	@AfterReturning(value="pointCut()")
	public void after(JoinPoint jp) {
		
		System.out.print("after alert:logging...");
		System.out.println(",target method be weavered strengthen is:"+ jp.getSignature().getName());
	
	}
	
//	around
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("inti alert:start transaction before excute object method...");
		Object obj = pjp.proceed();
		System.out.println("end alert:close transaction after excute object method...");
		return obj;
		
	}
	
	@AfterThrowing(value="pointCut()",throwing="e")
	public void afterThrowing(JoinPoint jp,Throwable e) {
		System.out.println("thread throw an alert:ERROR in "+e.getMessage());
	}
	
	@After("pointCut()")
	public void finalAlert() {
		System.out.println("alert:release resourse after all method be done!");
	}
}
