package com.cognizant.spring_learn.service;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.*;
@Service
public class StudentService {
public Student getStudent(int id) {
	//return new Student(202,"lalitha","CSE");
	if(id==101)
	{
		return new Student (101,"lalitha","cse");
	}
	return null;
}
}
