package com.onlineShop.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineShop.model.Order;

@Service
public interface OrderService {
	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public Order removeOrder(Order order);
	public Order viewOrder(Order order);
	public List<Order> viewAllOrders(LocalDate date);
	public List<Order> viewAllOrderByLocation(Integer addressId);
	//public List<Order> viewAllOrderByUserId(String userId);

}
