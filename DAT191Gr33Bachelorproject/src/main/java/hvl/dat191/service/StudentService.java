package hvl.dat191.service;

import java.util.List;

import hvl.dat191.model.Student;
import hvl.dat191.model.User;

public interface StudentService {

	List<Student> findAllStudent();
	
	void insertStudent(Student student);
	
	void updateStudent(Student student);
	
	void executeUpdateStudent(Student student);
	
	public void deleteStudent(Student student);
}
