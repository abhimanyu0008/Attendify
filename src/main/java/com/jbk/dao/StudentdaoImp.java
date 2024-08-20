package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entities.Student;

import jakarta.transaction.Transactional;

@Repository
public class StudentdaoImp implements Studentdao {

	@Autowired
	private SessionFactory factory;

	public String addStudent(Student student) {
		Session session = null;
		try {
			session = factory.openSession();
			session.save(student);
			session.beginTransaction().commit();
			return "add data success";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Transactional
	public List<Student> getAllStudent() {
		Session session = factory.openSession();
		return session.createQuery("from Student", Student.class).list();
	}

	@Transactional
	public Student getStudentById(int rollNo) {
		Session session = null;
		try {
			session = factory.openSession();
			Student student = session.get(Student.class, rollNo);
			return student;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}
		return null;
	}

	@Override
	@Transactional
	public String deleteStudent(int rollNo) {
		Session session = factory.openSession();
		Student student = session.get(Student.class, rollNo);
		session.remove(student);
		session.beginTransaction().commit();
		session.close();
		return "deleted successfully...";

	}

}
