package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.SubjectDao;
import com.jbk.entities.Subject;

@Service
public class SubjecServiceImp implements SubjectService {
	
	@Autowired
	private SubjectDao dao;
	@Override
	public String addSubject(Subject subject) {
		String msg=dao.addSubject(subject);
		return msg;
	}
	@Override
	public List<Subject> getAllSubject() {
		List<Subject>allsubject=dao.getAllSubject();
		return allsubject;
	}
	@Override
	public Subject getSubjectById(int id) {
		Subject getById=dao.getSubjectById(id);
		return getById;
	}
	@Override
	public String deleteById(int id) {
		String msg=dao.deleteById(id);
		return msg;
	}
	
	

	
}
