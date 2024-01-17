package com.jpa.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.main.entities.Student;
import com.jpa.main.service.StudentService;
import com.jpa.main.service.StudentServiceImp;

@RestController
@RequestMapping("/student")
public class MyController {
	
	private final StudentService studentService;
	
	//@Autowired
	private MyController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	
	
	
	@PostMapping("/add")
	public Student student(@RequestBody Student student)
	{
		return studentService.addstudent(student);
	}
	
	
	@GetMapping("/fetch")
	public Iterable<Student> getstudent()
	{
		
		return studentService.getAll();
	}
	@GetMapping("/fetch/{sid}")
	public Optional<Student> getonestudent(@PathVariable String sid)
	{
		return studentService.getonestudent(Integer.parseInt(sid));
	}
	
	@DeleteMapping("/delete/{sid}")
	public String del(@PathVariable String sid)
	{
		return studentService.getdel(Integer.parseInt(sid));
		
	}
	@PutMapping("/update")
	public Student updateInfo(@RequestBody Student stu)
	{
		return studentService.update(stu);
	}
	
}
