package com.jbk.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString 

@Entity
@Table(name="studentInfo")
public class Student {
	@Id
	private int rollNo;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private String gender;
	private String dob;
	private String address;
	private String studentId;
	private String department;
	private String className;
	
}
