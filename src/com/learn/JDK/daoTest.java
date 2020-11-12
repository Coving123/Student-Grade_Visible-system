package com.learn.JDK;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.dao.CustomerDao;
import com.learn.entity.Customer;

public class daoTest {
	
	@Test
	public void findCustomerByIdT() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		//CustomerDao dao = (CustomerDao) applicationContext.getBean("customerDao");
		CustomerDao dao = applicationContext.getBean(CustomerDao.class);
		Customer cus = dao.findCustomerById(1);
		System.out.println(cus);
	}

}
