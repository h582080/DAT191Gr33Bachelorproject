package hvl.dat191.model;


import jakarta.persistence.Table;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "student")
public class Student {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int studentId;
	
	private String name;
	private int phoneNr;
	private String email;
	
	public Student(String name, int phoneNr, String email) {
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
