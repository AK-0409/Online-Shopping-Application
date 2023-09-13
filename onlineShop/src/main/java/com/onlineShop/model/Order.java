package com.onlineShop.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Component
@Scope("prototype")
@Table(name="orders")
public class Order 
{ 
	@Id                                                 
  @GeneratedValue(strategy = GenerationType.IDENTITY)private int orderId;
	private LocalDate orderDate;
	private String orderStatus;
	@OneToOne
	private Customer customer;
	@OneToOne
	private Address address;
	
	@OneToMany
	private List<Product> productlist = new ArrayList<Product>();
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, LocalDate orderDate, String orderStatus, Customer customer, Address address,
			List<Product> productlist) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.customer = customer;
		this.address = address;
		this.productlist = productlist;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Product> getProductlist() {
		return productlist;
	}

	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", customer="
				+ customer + ", address=" + address + ", productlist=" + productlist + "]";
	}
	
	
	
}