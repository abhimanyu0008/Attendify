package com.jbk.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString

@Entity
@Table(name = "attendanceInfo")
public class Attendance {
	@Id
	private String id;
	
	private String date;
	private String time;
	private int counts;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "studentAttendance",joinColumns = @JoinColumn(name="aid"),
	inverseJoinColumns = @JoinColumn(name="studentId")
	)
	private List<Student>students;
	@ManyToOne
	@JoinColumn(name ="userInfo1" )
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "subjectInfo1")
	private Subject subject;
	
	

}
