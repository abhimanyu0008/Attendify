package com.jbk.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userInfo")
public class User {
	@Id
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String firstName;
	private String lastName;
	public User(String username, String password, String email, String mobile, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
