package com.onlineShop.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineShop.model.Order;
@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer>{
	 List<Order> findByOrderDate(LocalDate orderDate);
//
	List<Order> findByAddress_AddressId(Integer addressId);
//
	//List<Order> findByCustomer_UserId(String userId);
//
	}
