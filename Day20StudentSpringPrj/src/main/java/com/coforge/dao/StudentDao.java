package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.coforge.entities.Student;
import com.coforge.repository.StudentRepository;

public class StudentDao implements StudentDaoInterface {
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Optional<Student> getStudentById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Student updateCustomer(Student student, long id) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
