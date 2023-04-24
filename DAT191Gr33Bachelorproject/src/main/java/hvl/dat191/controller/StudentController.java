package hvl.dat191.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Student;
import hvl.dat191.service.StudentService;

@RestController
@RequestMapping("/studentApp")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@GetMapping("/studentList")
	public List<Student> findAllStudent() {
		return ss.findAllStudent();
	}

	@PostMapping("/createStudent")
	public void insertStudent(@RequestBody Student student) {
		ss.insertStudent(student);
	}

	@PutMapping("/updateStudent")
	public void updateStudent(@RequestBody Student student) {
		ss.updateStudent(student);
	}

	@PutMapping("/executeUpdateStudent")
	public void executeUpdateStudent(@RequestBody Student student) {
		ss.executeUpdateStudent(student);
	}

	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestBody Student student) {
		ss.deleteStudent(student);
	}
}
