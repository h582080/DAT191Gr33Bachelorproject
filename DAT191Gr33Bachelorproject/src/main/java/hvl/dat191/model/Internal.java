package hvl.dat191.model;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
@Table (appliesTo = "internal")
public class Internal {
	
	@Id
	private int internalId;
	
	private String name;
	private int phoneNr;
	private String email;
	
	public Internal(int internalId, String name, int phoneNr, String email) {
		this.internalId = internalId;
		this.name = name;
		this.phoneNr = phoneNr;
		this.email = email;
	}

	public int getInternalId() {
		return internalId;
	}

	public void setInternalId(int internalId) {
		this.internalId = internalId;
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
