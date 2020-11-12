package com.learn.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.learn.dao.CustomerDao;
import com.learn.entity.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.learn.entity.CustomerMapper.findCustomerById", id);
	}

}
