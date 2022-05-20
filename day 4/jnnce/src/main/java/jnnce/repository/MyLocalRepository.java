package jnnce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jnnce.bean.Student;

@Repository
public interface MyLocalRepository extends JpaRepository<Student, Long> {

}
