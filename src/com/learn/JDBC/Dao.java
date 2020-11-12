package com.learn.JDBC;

import java.util.List;

public interface Dao {

	public int add(Account a);
	public int update(Account a);
	public int sub(int id);		
	public Account findAccountById(int id);		
	public List<Account> findAllAccount();		
	
	public void transfer(String outer, String inner, Double money);
	
	
}
