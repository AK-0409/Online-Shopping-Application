package com.onlineShop.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
@Entity
@Component
@Scope("prototype")
public class Category 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoryName;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Category(int id, String categoryName) {
		super();
		this.id = id;
	
		this.categoryName = categoryName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + "]";
	}
	

}
