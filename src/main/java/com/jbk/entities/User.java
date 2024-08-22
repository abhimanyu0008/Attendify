package com.jbk.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "userInfo")
public class User {
	
	private int userId;
	@Id
	private String username;
	private String password;
	private String email;
	private String mobile;
	private String firstName;
	private String lastName;

	
}
