package com.jbk.service;

import java.util.List;

import com.jbk.entities.Subject;

public interface SubjectService {

	public String addSubject(Subject subject);

	public List<Subject> getAllSubject();

	public Subject getSubjectById(int id);

	public String deleteById(int id);

}
