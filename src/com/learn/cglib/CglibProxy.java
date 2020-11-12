package com.learn.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.learn.asp.Aspect;

public class CglibProxy implements MethodInterceptor {

	public Object createProxy(Object a) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(a.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object objProxy, Method func, Object[] args, MethodProxy funcProxy) throws Throwable {
		// TODO Auto-generated method stub
		Aspect as = new Aspect();
		as.check();
		Object obj = funcProxy.invokeSuper(objProxy, args);
		as.log();
		return obj;
	}

}
