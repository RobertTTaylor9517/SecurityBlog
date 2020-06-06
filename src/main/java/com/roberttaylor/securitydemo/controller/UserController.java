package com.roberttaylor.securitydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roberttaylor.securitydemo.dao.UserDAO;

@RestController
public class UserController {
	
	@Autowired
	private UserDAO userDAO;
	
	@GetMapping("/test")
	public String test() {
		return "Hello, user";
	}
}
