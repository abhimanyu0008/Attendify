package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.Studentdao;
import com.jbk.entities.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private Studentdao dao;

	public String addStudent(Student student) {
		String msg = dao.addStudent(student);
		return msg;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudent = dao.getAllStudent();
		return allStudent;
	}

	@Override
	public Student getStudentById(int rollNo) {
		Student student = dao.getStudentById(rollNo);
		return student;
	}

	@Override
	public String deleteStudent(int id) {
		String s = dao.deleteStudent(id);
		return s;
	}

	@Override
	public List<Student> getAllStudentByRoll(List<Integer> list) {
		List<Student>studentList=dao.getAllStudentByRoll(list);
		return studentList;
	}

	@Override
	public String updateStudent(Student student) {
		String msg = dao.updateStudent(student);
        return msg;
	}
}
