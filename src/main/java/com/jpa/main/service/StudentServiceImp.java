package com.jpa.main.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.main.dao.StudentDAO;
import com.jpa.main.entities.Student;

@Component
public class StudentServiceImp  implements StudentService{
	
	
	private final StudentDAO dao;
	
	@Autowired
	private StudentServiceImp(StudentDAO dao) {
		this.dao = dao;
		
	}
	

	public Student addstudent(Student student)
	{
		
		dao.save(student);
		return student;
	}
	
	
	public Iterable<Student> getAll() {
		return dao.findAll();
	}
	
	
	public Optional<Student> getonestudent(int sid)
	{
		return dao.findById(sid);
	}
	
	
	public String getdel(int sid)
	{
//		 dao.deleteById(sid);
//		 return "deleted";
		Optional<Student>getdeleob=dao.findById(sid);
		if(getdeleob.isPresent()) {
			dao.deleteById(sid);
		      return "Deleted";
		}
		else
		{
			return "No Suitable id Present";
		}
	}
	
	
	public Student update(Student stu) {
		return dao.save(stu);
		
	}

}
