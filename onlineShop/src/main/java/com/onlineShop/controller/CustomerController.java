package com.onlineShop.controller;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.onlineShop.model.Customer;
import com.onlineShop.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addcustomer")
    //@ResponseStatus(HttpStatus.CREATED)
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/{customerId}")
    public Customer updateCustomer(@PathVariable Integer customerId, @RequestBody Customer customer) {
        customer.setCustomerId(customerId);
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{customerId}")
    public Customer removeCustomer(@PathVariable Integer customerId) {
        return customerService.removeCustomer(customerId);
    }

    @GetMapping("/{customerId}")
    public Customer viewCustomer(@PathVariable Integer customerId) {
        return customerService.viewCustomer(customerId);
    }

    @GetMapping
    public List<Customer> viewAllCustomers() {
        return customerService.viewAllCustomer();
    }
}
