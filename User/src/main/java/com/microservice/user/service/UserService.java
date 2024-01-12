package com.microservice.user.service;

import java.util.List;

import com.microservice.user.entities.User;
 
public interface UserService {
	User saveUser(User user);
	//get all users
	List<User>getAllUser();
	//get single user
	User getUser(String userId);

 
}