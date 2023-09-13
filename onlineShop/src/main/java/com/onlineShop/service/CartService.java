package com.onlineShop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onlineShop.model.Cart;
import com.onlineShop.model.Product;
@Service
public interface CartService 
{
	public Cart addProductToCart(Cart cart,Product p,Integer quantity);
	public Cart removeProductFromCart(Cart cart,Product p);
	public Cart updateProductQuantity(Cart cart,Product p,Integer quantity);
	public List<Cart> removeAllProducts();
	public List<Cart> vieweAllProducts();
}
