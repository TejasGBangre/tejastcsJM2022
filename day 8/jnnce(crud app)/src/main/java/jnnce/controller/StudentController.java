package jnnce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jnnce.bean.Student;
import jnnce.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentServiec;
	
	@PostMapping(value = "/addstudent")
	public Student addStudent(@RequestBody Student student) {
		
		Student stud = studentServiec.saveStudent(student);
		
		return stud;
	}
	
	@GetMapping(value = "/viewallstudent")
	public List<Student> viewAllListOfStudent(){
		
	return studentServiec.getAllListOfStudents();
	
	}
	
	@GetMapping(value = "/viewstudent")
	public List<Student> viewStudentList(){
		
		return studentServiec.getStudentList();
	}
	
	@PutMapping(value = "/updatestudent/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long id) {
		
		Student updateDetails = studentServiec.updateStudent(student, id);
		return updateDetails;
	}
	
	@DeleteMapping(value = "/deletestudent/{id}")
	public String deleteStudentById(@PathVariable("id") Long id) {
		
		studentServiec.deleteStudentById(id);
		return "Deleted Successfully";
	}

}
