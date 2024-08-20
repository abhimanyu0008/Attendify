package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entities.Subject;
import com.jbk.entities.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory factory;
	@Override
	public String addUser(User user) {
		Session session=null;
		try {
			session=factory.openSession();
			session.save(user);
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
	public List<User> getAllUser() {
		Session s = factory.openSession();
		Session session = factory.openSession();
		return session.createQuery("from User", User.class).list();
	}
	@Override
	public User userGetById(int id) {
		Session session = null;
		try {
			session = factory.openSession();
			User getById = session.get(User.class, id);
			return getById;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}
		return null;
	}

}
