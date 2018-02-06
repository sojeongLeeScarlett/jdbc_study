package kr.or.dgit.jdbc_study.dao;

import java.util.List;

import kr.or.dgit.jdbc_study.dto.Student;

public interface StudentDao {
	Student frindStudentById(int studid);
	void insertStudent(Student student);
	void deleteStudent(int studid);
	List<Student> findAllStudents();
}
