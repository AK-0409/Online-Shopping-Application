package com.onlineShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineShop.model.Category;
@Repository
public interface CategoryRepository  extends JpaRepository<Category,Integer>{

}
