package com.onlineShop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineShop.model.Customer;

@Service
public interface CustomerService {
	public Customer findById(Integer customerId);
	public Customer addCustomer(Customer cust);
	public Customer updateCustomer(Customer cust);
	public Customer removeCustomer(Integer customerId);
	public Customer viewCustomer(Integer customerId);
	public List<Customer> viewAllCustomer();
}

