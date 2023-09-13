package com.onlineShop.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private String name;
    private double price;
	@OneToOne(cascade=CascadeType.ALL)
    private Category category;
	private String color;
	private String specification;
	private String manufacturer;
	private Integer quantity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int id, String name, double price, Category category, String color, String specification,
			String manufacturer, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.color = color;
		this.specification = specification;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", color="
				+ color + ", specification=" + specification + ", manufacturer=" + manufacturer + ", quantity="
				+ quantity + "]";
	}
	
	
}

