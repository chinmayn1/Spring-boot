package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.StudentRepository;
import com.example.demo.entity.Student;


@RestController
public class HomeController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/")
	public String index() {
		return "Welcome to spring boot crud operations";
	}
	//Create new record
	@PostMapping("/saveStudent")
	public Student saveData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	//Get all record from database
	@GetMapping("/getAllStudents")
	public List<Student> getAll() {
		List<Student> studentList= studentRepository.findAll();
		return studentList;
	}
	//Get single record
	@GetMapping("/getStudent/{rollNo}")
	public Student getStudent(@PathVariable int rollNo) {
		Optional<Student> student= studentRepository.findById(rollNo);
		Student studentL=student.get();
		return studentL;
	}
	
	//Delete record from database
	@DeleteMapping("/deleteStudent/{rollNo}")
	public String deleteStudent(@PathVariable int rollNo) {
		Student student = studentRepository.findById(rollNo).get();
		if(student!= null) 
			studentRepository.delete(student);
			return "Deleted Successfully!!";
		
	}
	@PutMapping("/updateStudent")
	public Student updateStudentData(@RequestBody Student student){
		studentRepository.save(student);
		return student;
		
	}
}
