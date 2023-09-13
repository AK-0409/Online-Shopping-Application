package com.onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineShop.model.Address;
import com.onlineShop.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address addAddress(Address add) {
		
		return addressRepository.save(add);
	}

	@Override
	public Address updateAddress(Address add) {
		// TODO Auto-generated method stub
		  return addressRepository.save(add);
	}

	@Override
	public Address removeAddress(Address add) {
		// TODO Auto-generated method stub
		addressRepository.delete(add);
        return add;
	}
	

	@Override
	public Address viewAllAddress(Address add) {
		// TODO Auto-generated method stub
		return addressRepository.findAll().stream().findFirst().orElse(null);
	}

	@Override
	public Address viewAddress(Integer addressId) {
		// TODO Auto-generated method stub
		return addressRepository.findById(addressId).orElse(null);
	}

	@Override
	public Address findById(int addressId) {
		// TODO Auto-generated method stub
		return addressRepository.findById(addressId).get();
	}

}
