package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entities.Subject;
import com.jbk.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService service;
	
	@PostMapping("/add-subject")
	public String addSubject(@RequestBody Subject subject) {
		System.out.println(subject);
		String msg=service.addSubject(subject);
		return msg;
	}
	
	@GetMapping("/get-all-subject")
	public List<Subject> getAllSubject() {
		List<Subject>allstudent=service.getAllSubject();
		return allstudent;
	}
	
	@GetMapping("/get-subject-by-id/{id}")
	public Subject getSubjectById(@PathVariable int id) {
		Subject getById=service.getSubjectById(id);
		return getById;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		String msg=service.deleteById(id);
		return msg;
	}
	@PutMapping("/update/{id}")
	public String updateSubject(@PathVariable int id) {
		return null;
	}
}
