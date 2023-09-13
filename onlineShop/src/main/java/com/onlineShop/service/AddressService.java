package com.onlineShop.service;

import org.springframework.stereotype.Service;

import com.onlineShop.model.Address;

@Service
public interface AddressService {
	public Address addAddress(Address add);
	public Address updateAddress(Address add);
	public Address removeAddress(Address add);
	public Address viewAllAddress(Address add);
	public Address viewAddress(Integer addressId);
	public Address findById(int addressId);

}