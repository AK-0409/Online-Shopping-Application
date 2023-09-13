package com.onlineShop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineShop.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    // You can add custom query methods here if needed
}
