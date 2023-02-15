package com.uni.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.entity.Student;
import com.uni.repository.StudentRepository;
import com.uni.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getAStudent(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateAStudent(Student student, long id) {
		// TODO Auto-generated method stub
		Student _student = studentRepository.findById(id).get();
		_student.setName(student.getName());
		_student.setEmail(student.getEmail());
		return studentRepository.save(_student);
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "The student with id " + id + " has been deleted!!!";
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByName(name);
	}

	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		return studentRepository.findByEmail(email);
	}

}
