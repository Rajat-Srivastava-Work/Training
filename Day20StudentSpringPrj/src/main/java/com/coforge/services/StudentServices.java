package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.StudentDao;
import com.coforge.entities.Student;

@Service
public class StudentServices implements StudentServicesInterface {
	
	@Autowired
	private StudentDao dao;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.saveStudent(student);
	}

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		return dao.getStudentById(id).orElseThrow(()->new RuntimeException());
	}

	@Override
	public Student updateStudent(Student student, long id) {
		// TODO Auto-generated method stub
		Student exStudent=dao.getStudentById(id).orElseThrow(()->new RuntimeException());
		if(exStudent!=null) {
			exStudent.setSname(student.getSname());
			exStudent.setMarks(student.getMarks());
			exStudent.setMobile(student.getMobile());
			return dao.saveStudent(exStudent);
		}
		return null;
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		Student exStudent=dao.getStudentById(id).orElseThrow(()->new RuntimeException());
		if(exStudent!=null) {
			dao.deleteStudent(id);
			System.out.println("Student data deleted successsfully");
		} else {
			System.out.println("no student with this id");
		}

	}

}
