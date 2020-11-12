package com.learn.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class ServiceImpl implements UserService {

	@Autowired
//	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public void Do() {
		this.userDao.Do();
		System.out.println("userService doing,too!");
	}

}
