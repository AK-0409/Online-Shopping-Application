package com.onlineShop.controller;

import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineShop.model.Cart;
import com.onlineShop.model.Product;
import com.onlineShop.repository.CartRepository;
import com.onlineShop.repository.ProductRepository;

@RestController
@RequestMapping("/cart")
public class CartController {
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CartController(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    // Endpoint to create a new cart
    @PostMapping("addcart")
    public Cart createCart(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

    // Endpoint to add a product to the cart
    @PostMapping("/{cartId}/addproduct")
    public Cart addProductToCart(@PathVariable Integer cartId, @RequestBody Product product) {
        Optional<Cart> cartOptional = cartRepository.findById(cartId);
        Optional<Product> productOptional = productRepository.findById(product.getId());

        if (cartOptional.isPresent() && productOptional.isPresent()) {
            Cart cart = cartOptional.get();
            Product productToAdd = productOptional.get();

            cart.addProduct(productToAdd);
            System.out.println(productToAdd);

            return cartRepository.save(cart);
        } else {
            // Handle the case when either cart or product is not found
            // You can return an error response or throw an exception here
            // For example, you can return a ResponseEntity with a specific HTTP status code.
            return null;
        }
    }


    // Endpoint to retrieve all carts
    @GetMapping("getallcart")
    public Iterable<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    // Endpoint to retrieve a cart by its ID
    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable Integer id) {
        return cartRepository.findById(id).get();
    }
}
