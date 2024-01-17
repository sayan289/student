package com.jpa.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.main.entities.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer>{

}
