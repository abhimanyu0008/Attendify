package com.jbk.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class AttendanceDto {
	private String id;
	private List<Integer>rollnos;
	private String username;
	private String name;
	private String date;
	private String time;
	private int count;
	private int subjectId;

}
