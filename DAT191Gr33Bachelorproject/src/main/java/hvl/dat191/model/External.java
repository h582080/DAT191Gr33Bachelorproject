package hvl.dat191.model;


import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "external")
public class External {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int externalId;
	
	private String name;
	private String companyName;
	private int phoneNr;
	private String email;
	
	public External() {
		
	}
	
	public External(String name, String companyName, int phoneNr, String email) {
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
