package com.uni.service;

import java.util.List;

import com.uni.entity.Student;

public interface StudentService {

	Student createStudent(Student student);

	List<Student> getAllStudents();

	Student getAStudent(long id);

	Student updateAStudent(Student student, long id);

	String delete(long id);

	Student getStudentByName(String name);

	Student getStudentByEmail(String email);

}
