package com.live.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.live.entity.Customer;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Customer> getCustomers() {
		//fetch Session from sessionfactory
		
		Session session = sessionFactory.getCurrentSession();
		//create the query (SQL query)
		Query <Customer> query =session.createQuery("from Customer order by lastName", Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
	}
	@Transactional
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession(); 
		session.save(customer);
		
	}


}