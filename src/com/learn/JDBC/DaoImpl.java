package com.learn.JDBC;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class DaoImpl implements Dao {

	private JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public int add(Account a) {

		Object[] obj = new Object[] { a.getName(), a.getBalance() };
		String sql = "insert into account(name,balance) value(?,?)";
		// TODO Auto-generated method stub
		int num = this.jdbc.update(sql, obj);
		return num;
	}

	@Override
	public int update(Account a) {
		// TODO Auto-generated method stub
		String sql = "update account set name=?, balance=? where id=?";
		Object[] obj1 = new Object[] { a.getName(), a.getBalance(), a.getId() };
		int num = this.jdbc.update(sql, obj1);
		return num;
	}

	@Override
	public int sub(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from account where id=?";
		int num = this.jdbc.update(sql, id);
		return num;
	}

	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from account where id=?";
		RowMapper<Account> rm = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbc.queryForObject(sql, rm, id);
	}

	@Override
	public List<Account> findAllAccount() {
		// TODO Auto-generated method stub
		String sql = "select * from account";
		RowMapper<Account> rm = new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbc.query(sql, rm);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
	public void transfer(String outer, String inner, Double money) {
		// TODO Auto-generated method stub
		this.jdbc.update("update account set balance = balance + ?"
				+ "where name = ?", money, inner);
		
		//int i= 1/0;
		
		this.jdbc.update("update account set balance = balance - ?"
				+ "where name = ?", money, outer);
		
	}

}
