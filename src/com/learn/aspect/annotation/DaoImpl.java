package com.learn.aspect.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class DaoImpl implements UserDao {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add a user!");
		

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("drop a user!");

	}

}
