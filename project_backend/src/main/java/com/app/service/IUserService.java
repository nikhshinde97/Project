package com.app.service;

import java.util.List;

import com.app.dto.LoginResponse;
import com.app.pojos.User;

public interface IUserService {
	List<User> fetchAllUsers();

	// add a method to save user details
	User saveUserDetails(User transientUser);
	

	// add a method to get User as per email name and password
	LoginResponse getUserByEmailAndPassword(String fn, String ln);
	
	public List<User> getAllusers();
}
