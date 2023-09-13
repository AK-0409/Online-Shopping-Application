package com.onlineShop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineShop.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    // You can add custom query methods here if needed
}
