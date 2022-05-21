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
	
	
	public Student addStudent(Student student) {
		Student addstudent = myLocalRepository.save(student);
		return addstudent;
	}


	public List<Student> getAllListOfStudents() {

		List<Student> listofallstudent = myLocalRepository.findAll();
		
		return listofallstudent;
	}


	public Student updateStudent(Student student, long id) {

		student.setId(id);
		Student updatestudent = myLocalRepository.save(student);
		
		return updatestudent;
	}


	
	public List<Student> getListOfStudent() {
		
		List<Student> listOfStudent = myLocalRepository.findAll();

		return listOfStudent;
	}



	public Student deleteStudentById(Student student, long id) {
		
		student.setId((long) id);
		Student deletestudentbyid = myLocalRepository.deleteById(student);

		return deletestudentbyid;
	}


	


	

}
