package com.jbk.dao;

import java.util.List;

import com.jbk.entities.User;

public interface UserDao {

	public String addUser(User user);

	public List<User> getAllUser();

	public User userGetById(String id);

	public String deleteUser(String id);

	

}
