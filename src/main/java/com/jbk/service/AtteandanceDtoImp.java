package com.jbk.service;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.AttendanceDao;
import com.jbk.entities.Attendance;
import com.jbk.model.AttendanceDto;

@Service
public class AtteandanceDtoImp implements AttendanceService {

	@Autowired
	private SubjectService subjectService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private AttendanceDao attendanceDao;
	
	@Override
	public String takeAttendance(AttendanceDto attendanceDto) {
		String id=new SimpleDateFormat("yyyymmddHHmmsss").format(new java.util.Date());
		attendanceDto.setId(id);
		Attendance attendance=new Attendance();
		attendance.setId(id);
		attendance.setDate(attendanceDto.getDate());
		attendance.setTime(attendanceDto.getTime());
		attendance.setCounts(attendanceDto.getRollnos().size());
		
		attendance.setSubject(subjectService.getSubjectById(attendanceDto.getSubjectId()));
		attendance.setUser(userService.userGetById(attendanceDto.getUsername()));
		attendance.setStudents(studentService.getAllStudentByRoll(attendanceDto.getRollnos()));
		
		return attendanceDao.takeAttendance(attendance);
	}

}
