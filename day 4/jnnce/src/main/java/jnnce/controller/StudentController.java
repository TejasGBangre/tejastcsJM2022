package jnnce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jnnce.bean.Student;
import jnnce.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentServiec;
	
	@PostMapping(value = "/addstudent")
	Student addStudent(@RequestBody Student student) {
		
		Student stud = studentServiec.addStudent(student);
		return stud;
	}

}
