package com.onlineShop.service;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineShop.model.Customer;
import com.onlineShop.repository.AddressRepository;
import com.onlineShop.repository.CustomerRepository;
@Service
public class CustomerServiceImpl  implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Override
	public Customer addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		addressRepository.save(cust.getAddress());
		return customerRepository.save(cust);
	}

	@Override
	public Customer updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		addressRepository.save(cust.getAddress());
		return customerRepository.save(cust);
		
	}

	@Override
	public Customer removeCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		Customer cust=customerRepository.findById(customerId).get();
		
		customerRepository.deleteById(customerId);
		return cust;
	}

	@Override
	public Customer viewCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		Optional<Customer> cust=customerRepository.findById(customerId);
		if(cust.isPresent())
		{
			return cust.get();
		}
		else
			
		
		return null;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();

	}

	@Override
	public Customer findById(Integer customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).get();
	}

}
