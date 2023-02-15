package com.uni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uni.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	Student findByName(String name);

	Student findByEmail(String email);
}
