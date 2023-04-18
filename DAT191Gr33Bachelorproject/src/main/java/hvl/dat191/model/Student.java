package hvl.dat191.model;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
@Table(appliesTo = "student")
public class Student {
	
	@Id 
	private int studentId;
	
	private String name;
	private int phoneNr;
	private String email;
	
	public Student(int studentId, String name, int phoneNr, String email) {
		this.studentId = studentId;
		this.name = name;
		this.phoneNr = phoneNr;
		this.email = email;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(int phoneNr) {
		this.phoneNr = phoneNr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
