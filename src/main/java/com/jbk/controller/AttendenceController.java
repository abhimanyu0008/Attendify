package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.AttendanceDto;
import com.jbk.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendenceController {
	
	@Autowired
	AttendanceService attendanceService;
	
	@PostMapping("/take-attence")
	public String takeAttendance(@RequestBody AttendanceDto attendance) {
		String msg=attendanceService.takeAttendance(attendance);
		return msg;
		
	}

}
