package hvl.dat191.serviceTestsImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.StudentDAO;
import hvl.dat191.model.Student;
import hvl.dat191.serviceTests.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO sd;
	
	@Override
	public List<Student> findAllStudent() {
		return sd.findAllStudent();
	}

	@Override
	public void insertStudent(Student student) {
		sd.insertStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		sd.updateStudent(student);
	}

	@Override
	public void executeUpdateStudent(Student student) {
		sd.executeUpdateStudent(student);
	}

	@Override
	public void deleteStudent(Student student) {
		sd.deleteStudent(student);
	}

}
