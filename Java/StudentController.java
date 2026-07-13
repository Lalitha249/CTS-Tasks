package com.cognizant.spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.*;
import com.cognizant.spring_learn.service.*;
@RestController
public class StudentController {
@Autowired
private StudentService studentService;

@GetMapping("/student")
public ResponseEntity<Student> getStudent()
{
	return ResponseEntity.ok(studentService.getStudent());
	
}
@PostMapping("/student")
public ResponseEntity<Student>addStudent(@RequestBody Student student)
{
	return ResponseEntity.status(HttpStatus.CREATED).body(student);
}
@GetMapping("/student/{id}")
public ResponseEntity<Student> getStudent(@PathVariable int id)
{
	Student student = studentService.getStudent(id);
	return ResponseEntity.ok(student);
}
}
