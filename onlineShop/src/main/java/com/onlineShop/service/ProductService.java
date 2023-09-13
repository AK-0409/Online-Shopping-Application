package com.onlineShop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineShop.model.Product;

@Service
public interface ProductService 
{
	public Product addProduct(Product product);
	public Product updateProduct(Product p);
	public List<Product> viewAllProduct();
	public Product viewProduct(Integer productId);
	public List<Product> viewProductByCategory(String cname);
	public Product removeProduct(Integer productId);
}
