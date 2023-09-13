package com.onlineShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineShop.model.Address;
@Repository
public interface AddressRepository  extends JpaRepository<Address,Integer>{

}
