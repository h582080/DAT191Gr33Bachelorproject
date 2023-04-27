package hvl.dat191.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table (name ="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int clientId;
	
	private String name;
	private String companyName;
	private int phoneNr;
	private String email;
	private int maxNumberOfProjectsSemester;
	private String clientType;
	
	public Client() {
		
	}
	
	public Client(String name, String companyName, int phoneNr,
	 String email, int maxNumberOfProjectsSemester, String clientType) {
		this.maxNumberOfProjectsSemester = maxNumberOfProjectsSemester;
		this.clientType = clientType;
	}

	public int getClientId() {
		return clientId;
	}
	
	public void setClientId(int clientId) {
		this.clientId = clientId;
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

	public int getMaxNumberOfProjectsSemester() {
		return maxNumberOfProjectsSemester;
	}

	public void setMaxNumberOfProjectsSemester(int maxNumberOfProjectsSemester) {
		this.maxNumberOfProjectsSemester = maxNumberOfProjectsSemester;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

}
