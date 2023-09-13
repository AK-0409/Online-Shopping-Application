package com.onlineShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineShop.model.Product;
import com.onlineShop.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Endpoint to create a new product
    @PostMapping("addproduct")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // Endpoint to retrieve all products
    @GetMapping("getallproduct")
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Endpoint to retrieve a product by its ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productRepository.findById(id).get();
    }
}
