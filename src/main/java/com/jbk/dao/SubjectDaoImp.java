package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entities.Student;
import com.jbk.entities.Subject;

import jakarta.transaction.Transactional;

@Repository
public class SubjectDaoImp implements SubjectDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public String addSubject(Subject subject) {
		Session session=null;
		try {
			session= factory.openSession();
			session.save(subject);
			session.beginTransaction().commit();
			return "add successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	@Override
	public List<Subject> getAllSubject() {
		Session s = factory.openSession();
		Session session = factory.openSession();
		return session.createQuery("from Subject", Subject.class).list();
	}
	@Override
	@Transactional
	public Subject getSubjectById(int id) {
		Session session = null;
		try {
			session = factory.openSession();
			Subject getById = session.get(Subject.class, id);
			return getById;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}
		return null;
	}
	@Override
	public String deleteById(int id) {
		Session session = factory.openSession();
		Subject sub = session.get(Subject.class, id);
		session.remove(sub);
		session.beginTransaction().commit();
		session.close();
		return "deleted successfully...";
		
	}
}
