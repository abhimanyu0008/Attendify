package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entities.User;
import com.jbk.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/add-user")
	public String addUser(@RequestBody User user) {
		System.out.println(user);
		String msg=service.addUser(user);
		return msg;
	}
	
	@GetMapping("/get-all-user")
	public List<User>getAllUser(){
		List<User>getuser=service.getAllUser();
		return getuser;
	}
	
	@GetMapping("/get-by-id/{id}")
	public User userGetById(@PathVariable int id) {
		User user=service.userGetById(id);
		return user;
	}
}
