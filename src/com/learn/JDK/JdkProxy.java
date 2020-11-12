package com.learn.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.learn.JDK.UserDao;
import com.learn.asp.Aspect;

public class JdkProxy implements InvocationHandler {

	private UserDao userDao;
	
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		Class<?>[] clasz = userDao.getClass().getInterfaces();
		return Proxy.newProxyInstance(classLoader, clasz, this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Aspect as = new Aspect();
		as.check();
		Object obj = method.invoke(userDao, args);
		as.log();
		return obj;
	}

}
