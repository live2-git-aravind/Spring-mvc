package com.live.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.live.entity.Customer;
import com.live.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
@Autowired
private CustomerService customerService;
@GetMapping(value = "/list")
public String getCustomers(Model modelfromSpring) {
	List<Customer> customersList = customerService.getCustomers();
	modelfromSpring.addAttribute("customerModelfromController", customersList);
	return "customers";
}
@GetMapping("/addCustomer")	
private String addCustomer(Model customerModelFromController) {
Customer customer=new Customer();		
customerModelFromController.addAttribute("customerModel", customer);	
	return "add-customer";
	}
@PostMapping("/saveCustomer")
public String saveCustomer(@ModelAttribute("customerModel") Customer customerModel) {
	customerService.saveCustomer(customerModel);
	return "redirect:/ecommerce/customer/list";
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

