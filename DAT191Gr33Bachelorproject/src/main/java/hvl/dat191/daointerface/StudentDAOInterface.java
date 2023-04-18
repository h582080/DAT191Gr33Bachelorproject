package hvl.dat191.daointerface;

import java.util.List;

import hvl.dat191.model.Student;

public interface StudentDAOInterface {
	
List<Student> findAll();
	
	void insertStudent(Student student);
	
	void updateStudent(Student student);
	
	void executeUpdateStudent(Student student);
	
	public void deleteStudent(Student student);

}
