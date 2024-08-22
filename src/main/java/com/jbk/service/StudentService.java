package com.jbk.service;

import java.util.List;

import com.jbk.entities.Student;

public interface StudentService {
	
	public String addStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudentById(int id);

	public String deleteStudent(int id);
	
	public List<Student>getAllStudentByRoll(List<Integer>list);

	public String updateStudent(Student student);
}
