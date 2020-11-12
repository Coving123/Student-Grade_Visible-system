package com.learn.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		System.out.println("this is what userDao do...");
	}

}
