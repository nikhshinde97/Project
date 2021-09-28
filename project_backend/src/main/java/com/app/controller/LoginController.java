package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginRequest;
import com.app.dto.LoginResponse;
import com.app.service.UserServiceImpl;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	@Autowired
	private UserServiceImpl userService;

	public LoginController() {
		System.out.println("in constructor of " + getClass().getName());
	}
	
	@PostMapping
	public LoginResponse getUserByNames(@RequestBody LoginRequest user) {
		System.out.println("in getAllUsers " + getClass().getName());
		System.out.println(user.getEmail());
		return userService.getUserByEmailAndPassword(user.getEmail(), user.getPassword());
	}

	@GetMapping
	public String getHome() {
		return "This is Home Page";
	}
}
