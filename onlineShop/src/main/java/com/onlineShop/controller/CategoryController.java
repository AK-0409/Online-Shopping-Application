package com.onlineShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.onlineShop.model.Category;
import com.onlineShop.repository.CategoryRepository;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostMapping("/addcategory")
    @ResponseStatus(HttpStatus.CREATED)
    public Category addCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category category) {
        category.setId(id);
        return categoryRepository.save(category);
    }

    @DeleteMapping("/{id}")
    public void removeCategory(@PathVariable int id) {
        categoryRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Category viewCategory(@PathVariable int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Category> viewAllCategories() {
        return categoryRepository.findAll();
    }
}
