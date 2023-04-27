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
	
	private int maxNumberOfProjectsSemester;
	private String clientType;
	
	public Client() {
		
	}
	
	public Client(int maxNumberOfProjectsSemester, String clientType) {
		this.maxNumberOfProjectsSemester = maxNumberOfProjectsSemester;
		this.clientType = clientType;
	}

	public int getClientId() {
		return clientId;
	}
	
	public void setClientId(int clientId) {
		this.clientId = clientId;
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
