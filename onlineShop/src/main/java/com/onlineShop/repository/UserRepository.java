package com.onlineShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineShop.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
