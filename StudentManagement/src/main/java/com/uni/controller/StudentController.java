package com.uni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uni.entity.Student;
import com.uni.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	// get all students
	@GetMapping("/students")
	public List<Student> getCAllStudents() {
		return studentService.getAllStudents();
	}

	// get a student
	@GetMapping("/students/{id}")
	public Student getCAStudent(@PathVariable long id) {
		return studentService.getAStudent(id);
	}

	// get a student by name
	@GetMapping("/studentByName")
	public Student getCAStudentByName(@RequestParam String name) {
		return studentService.getStudentByName(name);
	}

	// get a student by email
	@GetMapping("/studentByEmail")
	public Student getCAStudentByEmail(@RequestParam String email) {
		return studentService.getStudentByEmail(email);
	}

	// create a student
	@PostMapping("/students")
	public Student createANewStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	// update a student
	@PutMapping("/students/{id}")
	public Student updateCStudent(@PathVariable long id, @RequestBody Student student) {
		return studentService.updateAStudent(student, id);
	}

	// delete an existing student
	@DeleteMapping("/students/{id}")
	public String deleteCStudent(@PathVariable long id) {
		return studentService.delete(id);
	}

}
