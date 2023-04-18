package hvl.dat191.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@Table (name ="client")
public class Client {
	
	@Id
	private int clientId;
	private int maxNumberOfProjectsSemester;
	private String clientType;
	
	public Client(int maxNumberOfProjectsSemester, String clientType) {
		this.maxNumberOfProjectsSemester = maxNumberOfProjectsSemester;
		this.clientType = clientType;
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
