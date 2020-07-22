package com.live.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.live.entity.Customer;
import com.live.repository.CustomerRepository;
@Service

public class CustomerServiceImpl implements CustomerService{
@Autowired
private CustomerRepository customerRepository;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerRepository.saveCustomer(customer);
	}
}