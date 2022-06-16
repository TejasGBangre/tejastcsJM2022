package jnnce.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jnnce.bean.Student;
import jnnce.repository.MyLocalRepository;
import jnnce.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	MyLocalRepository myLocalRepository;
	
	
	public Student saveStudent(Student student) {
		Student addstudent = myLocalRepository.save(student);
		return addstudent;
	}


	public List<Student> getAllListOfStudents() {

		List<Student> listofallstudent = myLocalRepository.findAll();
		
		return listofallstudent;
	}


	public Student updateStudent(Student student, Long id) {

		student.setId(id);
		Student updatestudent = myLocalRepository.save(student);
		
		return updatestudent;
	}


	
	public  List<Student> getStudentList() {
		
		List<Student> listOfStudent = myLocalRepository.findAll();

		return listOfStudent;
	}



	public void deleteStudentById(Long id) {
		
		
		myLocalRepository.deleteById(id);

	}	

}
