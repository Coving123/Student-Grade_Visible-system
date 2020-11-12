package com.learn.pojo;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.learn.utils.MybatisUtils;

public class testAssociation {

	/*
	 * @Test public void findPersonByIdT() { SqlSession sqlSession =
	 * MybatisUtils.getSession(); Person p =
	 * sqlSession.selectOne("com.learn.mapper.PersonMapper.findPersonByID", 1);
	 * System.out.println(p.getName()); sqlSession.close(); }
	 * 
	 * @Test public void findPersonById2T() { SqlSession sqlSession =
	 * MybatisUtils.getSession(); Person p =
	 * sqlSession.selectOne("com.learn.mapper.PersonMapper.findPersonByIDas", 1);
	 * System.out.println(p); sqlSession.close(); }
	 * 
	 * @Test public void findUserT() { SqlSession sqlSession =
	 * MybatisUtils.getSession(); User u =
	 * sqlSession.selectOne("com.learn.mapper.UserMapper.findUserWithOrders", 1);
	 * System.out.println(u); sqlSession.close(); }
	 */

	@Test
	public void findOrdersIncludeProductT() {
		SqlSession sqlSession = MybatisUtils.getSession();
		Orders o = sqlSession.selectOne("com.learn.mapper.OrdersMapper.findOrdersIncludeProduct", 1);
		System.out.println(o);
		sqlSession.close();
	}

}
