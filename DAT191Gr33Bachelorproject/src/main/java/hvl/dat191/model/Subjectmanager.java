package hvl.dat191.model;


import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "subjectmanager")
public class Subjectmanager {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int subjectmanagerId;
	
	private String name;
	private String email;
	
//	@ManyToMany
//	Set<Projectcollection> colletionHandling;
	
	public Subjectmanager() {
		
	}
	
	public Subjectmanager(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public int getSubjectmanagerId() {
		return subjectmanagerId;
	}

	public void setSubjectmanagerId(int subjectmanagerId) {
		this.subjectmanagerId = subjectmanagerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
