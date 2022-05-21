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
	Student addStudent(@RequestBody Student student) {
		
		Student stud = studentServiec.addStudent(student);
		System.out.println("student->>>>> " + stud.getStudentname());
		System.out.println("branch->>>>> " + stud.getBranchname());
		System.out.println("usn->>>>> " + stud.getUsn());
		return stud;
	}
	
	@GetMapping(value = "/viewallstudent")
	List<Student> viewAllListOfStudent(){
		
	return studentServiec.getAllListOfStudents();
	
	}
	
	@GetMapping(value = "/viewstudent/{id}")
	List<Student> viewListOfStudent(@RequestBody Student viewslistoftudent, @PathVariable long id){
		
		return studentServiec.getListOfStudent();
	}
	
	@PutMapping(value = "/updatestudent/{id}")
	Student updateStudent(@RequestBody Student updatestudent, @PathVariable long id) {
		
		Student updateDetails = studentServiec.updateStudent(updatestudent, id);
		return updateDetails;
	}
	
	@DeleteMapping(value = "/deletestudent/{id}")
	Student deleteStudentById(@RequestBody Student deletestudentbyid, @PathVariable long id) {
		
		Student deleteDetails = studentServiec.deleteStudentById(deletestudentbyid, id);
		return deleteDetails;
	}

}
