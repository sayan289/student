package com.jpa.main.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jpa.main.entities.Student;

@Service
public interface StudentService {
	public Student addstudent(Student stu);
	public Student update(Student stu);
	public String getdel(int sid);
	public Optional<Student> getonestudent(int sid);
	public Iterable<Student> getAll();
}
