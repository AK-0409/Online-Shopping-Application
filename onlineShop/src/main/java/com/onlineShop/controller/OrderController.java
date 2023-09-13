package com.onlineShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import com.onlineShop.model.Address;
import com.onlineShop.model.Customer;
import com.onlineShop.model.Order;
import com.onlineShop.repository.OrderRepository;
import com.onlineShop.service.AddressService;
import com.onlineShop.service.CustomerService;
import com.onlineShop.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

   @Autowired
   private OrderService orderService ;
   
   @Autowired
   private CustomerService customerService;
   
   @Autowired
   private AddressService addressService;

    

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order) {
    	Customer c = customerService.findById(order.getCustomer().getCustomerId());
    	Address ad = addressService.findById(c.getAddress().getAddressId());
    	order.setAddress(ad);
    	
        return orderService.addOrder(order);
    }

    @PutMapping("/update")
    public Order updateOrder(@RequestBody Order order) {
        //Order updatedOrder = orderService.updateOrder(order);
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/remove")
    public Order removeOrder(@RequestBody Order order) {
//        Order removedOrder = orderService.removeOrder(order);
//        if (removedOrder != null) {
//            return new ResponseEntity<>(removedOrder, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
    	return orderService.removeOrder(order);
    }

    @GetMapping("/view/{orderId}")
    public Order viewOrder(@PathVariable Order order) {
        return orderService.viewOrder(order);
    }

//    @GetMapping("/viewAllByDate")
//    public ResponseEntity<List<Order>> viewAllOrdersByDate(@RequestParam String date) {
//        // Parse the date string to LocalDate
//        LocalDate orderDate = LocalDate.parse(date);
//        List<Order> ordersByDate = orderService.viewAllOrders(orderDate);
//        return new ResponseEntity<>(ordersByDate, HttpStatus.OK);
//    }
//
//    @GetMapping("/viewAllByLocation")
//    public ResponseEntity<List<Order>> viewAllOrdersByLocation(@RequestParam Integer addressId) {
//        List<Order> ordersByLocation = orderService.viewAllOrderByLocation(addressId);
//        return new ResponseEntity<>(ordersByLocation, HttpStatus.OK);
//    }

//    @GetMapping("/viewAllByUserId")
//    public ResponseEntity<List<Order>> viewAllOrdersByUserId(@RequestParam String userId) {
//        List<Order> ordersByUserId = orderService.viewAllOrderByUserId(userId);
//        return new ResponseEntity<>(ordersByUserId, HttpStatus.OK);
//    }
}
