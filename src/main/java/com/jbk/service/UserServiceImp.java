package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.UserDao;
import com.jbk.entities.User;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao dao;
	@Override
	public String addUser(User user) {
		String msg=dao.addUser(user);
		return msg;
	}
	@Override
	public List<User> getAllUser() {
		List<User>getuser=dao.getAllUser();
		return getuser;
	}
	@Override
	public User userGetById(String id) {
		User user=dao.userGetById(id);
		return user;
	}
	@Override
	public String deleteUser(String id) {
		String msg=dao.deleteUser(id);
		return msg;
	}
	

}
