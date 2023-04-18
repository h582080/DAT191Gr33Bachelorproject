package hvl.dat191.model;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;


@Entity
@Table(appliesTo = "external")
public class External {
	
	@Id
	private int externalId;
	private String name;
	private String companyName;
	private int phoneNr;
	private String email;
	
	public External(int externalId, String name, String companyName, int phoneNr, String email) {
		this.externalId = externalId;
		this.name = name;
		this.companyName = companyName;
		this.phoneNr = phoneNr;
		this.email = email;
	}

	public int getExternalId() {
		return externalId;
	}

	public void setExternalId(int externalId) {
		this.externalId = externalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
