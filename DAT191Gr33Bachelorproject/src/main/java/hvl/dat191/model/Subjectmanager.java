package hvl.dat191.model;


import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
@Table(name = "subjectmanager")
public class Subjectmanager {
	
	@Id
	private int subjectmanagerId;
	
	private String name;
	private String email;
	
	public Subjectmanager(int subjectmanagerId, String name, String email) {
		this.subjectmanagerId = subjectmanagerId;
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
