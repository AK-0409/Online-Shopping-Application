package com.onlineShop.service;

import org.springframework.stereotype.Service;

import com.onlineShop.model.User;
@Service
public interface UserService
{
	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
	public User signOut(User user);

}
