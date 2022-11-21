package com.student.services;

import java.util.List;
import java.util.Optional;

import com.student.entity.Student;


public interface IStudentService {
	
	Integer saveStudent (Student student);
	
	Optional<Student> getStudent(Integer id);
	
	public List<Student> getAllStudents();
	
	public void deleteStudent(Integer id);
	
	Student updateStudent(Student student, Integer id);

}
