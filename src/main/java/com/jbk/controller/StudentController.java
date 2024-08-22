package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entities.Student;
import com.jbk.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/get-all-students")
	public List<Student> getAllStudent() {
		List<Student> allStudent = service.getAllStudent();
		return allStudent;
	}

	// localhost:3306
	@PostMapping("/add-students")
	public String addStudent(@RequestBody Student student) {
//		System.out.println(student);
		String msg = service.addStudent(student);
		return msg;
	}

	@GetMapping("/get-student-by-id/{id}")
	public Student getStudentById(@PathVariable int id) {
		Student student1 = service.getStudentById(id);
		return student1;
	}

	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student student) {
	    String msg = service.updateStudent(student);
	    return msg;
	}

	@DeleteMapping("/delete/{rollno}")
	public String delete(@PathVariable int rollno) {
		String s = service.deleteStudent(rollno);
		return s;
	}
}
