package com.learn.JDBC;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

public class testJDBC {

	/*
	 * public static void main(String[] args) {
	 * 
	 * ClassPathXmlApplicationContext ap = new
	 * ClassPathXmlApplicationContext("applicationContext.xml"); JdbcTemplate jdbc =
	 * (JdbcTemplate) ap.getBean("jdbcTemplate");
	 * jdbc.execute("create table account(" + "id int primary key auto_increment," +
	 * "username varchar(50)," + "balance double)");
	 * System.out.println("Table account has been created!");
	 * 
	 * }
	 */

	/*
	 * @Test public void mainTest(){
	 * 
	 * ClassPathXmlApplicationContext ap = new
	 * ClassPathXmlApplicationContext("applicationContext.xml"); JdbcTemplate jdbc =
	 * (JdbcTemplate) ap.getBean("jdbcTemplate");
	 * jdbc.execute("create table account(" + "id int primary key auto_increment," +
	 * "username varchar(50)," + "balance double)");
	 * System.out.println("Table account has been created!");
	 * 
	 * }
	 */

	/*@Test
	public void addTest() {

		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dao d = (Dao) ap.getBean("dao");
		Account ac = new Account();
		ac.setName("YD");
		ac.setBalance(2000.00);
		int num = d.add(ac);
		if (num > 0) {
			System.out.println("Table account update "+num+" dates has been succeed!");
		}else {
			System.out.println("It must be something wrong!");
		}
	}
	
	@Test
	public void updateTest() {

		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dao d = (Dao) ap.getBean("dao");
		Account ac = new Account();
		ac.setId(1);
		ac.setName("YD");
		ac.setBalance(5000.00);
		int num = d.update(ac);
		if (num > 0) {
			System.out.println("Table account update "+num+" date has been succeed!");
		}else {
			System.out.println("It must be something wrong!");
		}
	}*/
	
	@Test
	public void subTest() {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dao d = (Dao) ap.getBean("dao");
		int num = d.sub(2);
		if (num > 0) {
			System.out.println("Table account delete "+num+" date has been succeed!");
		}else {
			System.out.println("It must be something wrong!");
		}
	}
	
	@Test
	public void findByIdTest() {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dao d = (Dao) ap.getBean("dao");
		Account ac = d.findAccountById(3);
		if (ac!=null) {
			System.out.println("Table account find:"+ac);
		}else {
			System.out.println("It must be something wrong!");
		}
	}
	
	@Test
	public void findAllTest() {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dao d = (Dao) ap.getBean("dao");
		List<Account> ac = d.findAllAccount();
		if (ac!=null) {
			for(Account a:ac)
			System.out.println("All table account has been find:"+a);
		}else {
			System.out.println("It must be something wrong!");
		}
	}

}
