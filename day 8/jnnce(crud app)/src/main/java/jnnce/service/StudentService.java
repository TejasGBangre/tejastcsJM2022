package jnnce.service;

import java.util.List;

import jnnce.bean.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getAllListOfStudents();
	
	Student updateStudent(Student student,Long id);

	List<Student> getStudentList();

	void deleteStudentById(Long id);


	

}
