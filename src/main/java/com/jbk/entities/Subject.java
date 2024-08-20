package com.jbk.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subjectinfo")
public class Subject {
	@Id
	private int id;
	private String name;
	private String code;
	public Subject(int id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	
	

}
