package com.jbk.service;

import java.util.List;

import com.jbk.entities.User;

public interface UserService {

	public String addUser(User user);

	public List<User> getAllUser();

	public User userGetById(int id);

}
