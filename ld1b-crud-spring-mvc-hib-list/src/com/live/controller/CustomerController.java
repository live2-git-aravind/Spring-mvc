package com.live.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.live.model.Customer;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
@GetMapping(value = "/list")
public String getProducts(Model modelfromSpring) {
	List<Customer> customersList = getCustomerStub();
	modelfromSpring.addAttribute("customerModelfromController", customersList);
	return "customers";
}
	private List<Customer> getCustomerStub() {
	System.out.println("/customer/list");
	List<Customer> customersList= new ArrayList<>();
	Customer customer=new Customer(); 
	customer.setId(1);
	customer.setFirstName("Aravind");
	customer.setLastName("Pomar");
	customersList.add(customer);
	customer= new Customer();
	customer.setId(2);
	customer.setFirstName("Balaji");
	customer.setLastName("Paidy");
	customersList.add(customer);
	
	return customersList;
	}

}
