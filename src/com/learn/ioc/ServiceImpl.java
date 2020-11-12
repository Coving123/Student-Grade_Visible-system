package com.learn.ioc;

public class ServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		this.userDao.say();
		System.out.println("userService is here,too!");
	}

}
