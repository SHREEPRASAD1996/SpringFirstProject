package com.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uni.entity.Student;
import com.uni.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Student s1 = Student.builder().name("Akd").email("ak@gmail.com").build();
		Student s2 = Student.builder().name("Skd").email("sk@gmail.com").build();
		Student s3 = Student.builder().name("Ppd").email("pp@gmail.com").build();
		Student s4 = Student.builder().name("Ajd").email("aj@gmail.com").build();
		Student s5 = Student.builder().name("Sjd").email("sj@gmail.com").build();

		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
		studentRepository.save(s5);

		System.out.println("---------------All are saved-------------");

	}

}
