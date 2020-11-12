package com.learn.pojo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.learn.utils.MybatisUtils;

public class testMybatis {

	/*@Test
	public void cacheL1Test() {
		
		SqlSession sqlSession = MybatisUtils.getSession();
		Customer cus = sqlSession.selectOne("com.learn.pojo.Customer.findById", 1);
		System.out.println(cus.toString());
		sqlSession.commit();
		//clear
		cus = sqlSession.selectOne("com.learn.pojo.Customer.findById", 1);
		System.out.println(cus.toString());
		sqlSession.close();

	}
	
	@Test
	public void cacheL2Test() {
		
		SqlSession sqlSession = MybatisUtils.getSession();
		Customer cus = sqlSession.selectOne("com.learn.pojo.Customer.findById", 1);
		System.out.println(cus.toString());
		sqlSession.close();//sqlsession has been closed
		
		sqlSession = MybatisUtils.getSession();//get new cache
		cus = sqlSession.selectOne("com.learn.pojo.Customer.findById", 1);
		System.out.println(cus.toString());
		sqlSession.close();
		
	}*/
	
	
	/*@Test
	public void findById() throws Exception {

		String res = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Customer cus = sqlSession.selectOne("com.learn.pojo.Customer.findById", 1);
		System.out.println(cus.toString());
		sqlSession.close();

	}*/

	@Test
	public void findByName() throws Exception {

		String res = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Customer1> list = sqlSession.selectList("com.learn.pojo.Customer.findByName", "Y");
		for (Customer1 customer : list) {
			System.out.println(customer);
		}
		sqlSession.close();
	}

	/*@Test
	public void addTest() throws Exception {

		String res = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Customer cus = new Customer();
		cus.setName("FQ");
		cus.setJobs("Manner");
		cus.setPhone("15625983985");
		int rows = sqlSession.insert("com.learn.pojo.Customer.addCustomer", cus);
		if (rows > 0) {
			System.out.println("You have succeed insert " + rows + " datas!");
		} else {
			System.out.println("something error!");
		}
		sqlSession.commit();
		System.out.println(cus.getId());
		sqlSession.close();
	}*/

	/*@Test
	public void updateTest() throws Exception {

		String res = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Customer cus = new Customer();
		cus.setId(4);
		cus.setName("FQ");
		cus.setJobs("programmer");
		cus.setPhone("15621783985");
		int rows = sqlSession.update("com.learn.pojo.Customer.updateCustomer", cus);
		if (rows > 0) {
			System.out.println("You have succeed update " + rows + " datas!");
		} else {
			System.out.println("Something be error!");
		}
		sqlSession.commit();
		sqlSession.close();
	}*/
	
	@Test
	public void deleteTest() throws Exception {

		/*String res = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(res);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();*/
		SqlSession sqlSession = MybatisUtils.getSession();
		int rows = sqlSession.delete("com.learn.pojo.Customer.deleteCustomer", 4);
		if (rows > 0) {
			System.out.println("You have succeed delete " + rows + " datas!");
		} else {
			System.out.println("Something be error!");
		}
		sqlSession.commit();
		sqlSession.close();
	}
	
	/*@Test
	public void findAllUserTest() {
		
		SqlSession sqlSession = MybatisUtils.getSession();
		List<User> list = sqlSession.selectList("com.learn.pojo.User.findAllUser");
		for(User us:list) {
			System.out.println(us);
		}
		sqlSession.close();
	}*/
		
	@Test
	public void findCustomerByNameAndJobsT() {
		
		SqlSession session = MybatisUtils.getSession();
		Customer1 cus = new Customer1();
		cus.setName("YD");
		cus.setJobs("stronger");
		List<Customer1> list = session.selectList("com.learn.mapper.CustomerMapper.findCustomerByNameAndJobs", cus);
		for( Customer1 c: list) {
			System.out.println(c);
		}
		session.close();	
	}
	
	/*@Test
	public void findCustomerByNameOrJobsT() {
		
		SqlSession session = MybatisUtils.getSession();
		Customer cus = new Customer();
//		cus.setName("YD");
//		cus.setJobs("stronger");
		List<Customer> list = session.selectList("com.learn.mapper.CustomerMapper.findCustomerByNameOrJobs", cus);
		for( Customer c: list) {
			System.out.println(c);
		}
		session.close();	
	}*/
	
	@Test
	public void updateCusT() {
		
		SqlSession session = MybatisUtils.getSession();
		Customer1 cus = new Customer1();
		cus.setId(5);
		cus.setPhone("15628265972");
		int r = session.update("com.learn.mapper.CustomerMapper.updateCus", cus);
		if(r>0) {
			System.out.println("you have succeed update "+r+" dates!");
		}else {
			System.out.println("something error!");
		}
		session.commit();//add,delete,update must be commit!!!!!
		session.close();	
	}
	
	@Test
	public void findCustomerByIdsT() {
		SqlSession sqlSession = MybatisUtils.getSession();
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		List<Customer1> list = sqlSession.selectList("com.learn.mapper.CustomerMapper.findCustomerByIds", ids);
		for(Customer1 x : list) {
			System.out.println(x);
		}
		sqlSession.close();
	}
	
	@Test
	public void findCusByNameT() {
		SqlSession sqlSession = MybatisUtils.getSession();
		Customer1 cus = new Customer1();
		cus.setName("Y");
		List<Customer1> list = sqlSession.selectList("com.learn.mapper.CustomerMapper.findCusByName", cus);
		for(Customer1 x : list) {
			System.out.println(x);
		}
		sqlSession.close();
	}
	
}
