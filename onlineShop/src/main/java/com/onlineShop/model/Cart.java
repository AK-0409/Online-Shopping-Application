package com.onlineShop.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public Cart() {
    }
    public Cart(int id, List<Product> products, Customer customer) {
		super();
		this.id = id;
		this.products = products;
		this.customer = customer;
	}
    // Parameterized constructor
    

    // Getters and setters

    public Integer  getId() {
        return id;
    }

   

	public void setId(Integer  id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Helper methods to add and remove products from the cart

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", products=" + products + ", customer=" + customer + "]";
	}

	
}

