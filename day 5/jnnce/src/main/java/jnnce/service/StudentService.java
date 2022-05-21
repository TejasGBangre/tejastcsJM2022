package jnnce.service;

import java.util.List;

import jnnce.bean.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	List<Student> getAllListOfStudents();
	
	Student updateStudent(Student student,long id);

	List<Student> getListOfStudent();

	Student deleteStudentById(Student student, long id);


	

}
