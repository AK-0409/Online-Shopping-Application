package com.onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineShop.model.Order;
import com.onlineShop.repository.OrderRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        // Check if the order exists in the database
        if (orderRepository.existsById(order.getOrderId())) {
            return orderRepository.save(order);
        }
        return null; // Order not found
    }

    @Override
    public Order removeOrder(Order order) {
        // Check if the order exists in the database
        if (orderRepository.existsById(order.getOrderId())) {
            orderRepository.delete(order);
            return order;
        }
        return null; // Order not found
    }

    @Override
    public Order viewOrder(Order order) {
        // Find the order by ID
        return orderRepository.findById(order.getOrderId()).orElse(null);
    }

    @Override
    public List<Order> viewAllOrders(LocalDate date) {
        // Find orders by the specified date
        return orderRepository.findByOrderDate(date);
    }

    @Override
    public List<Order> viewAllOrderByLocation(Integer addressId) {
        // Find orders by the specified location (address ID)
        return orderRepository.findByAddress_AddressId(addressId);
    }

//    @Override
//    public List<Order> viewAllOrderByUserId(String userId) {
//        // Find orders by the specified user ID
//        return orderRepository.findByCustomer_UserId(userId);
//    }
}
