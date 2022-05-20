package jnnce.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jnnce.bean.Student;
import jnnce.repository.MyLocalRepository;
import jnnce.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	MyLocalRepository myLocalRepository;
	
	@Override
	public Student addStudent(Student student) {
		Student studentadded = myLocalRepository.save(student);
		return studentadded;
	}
	

}
