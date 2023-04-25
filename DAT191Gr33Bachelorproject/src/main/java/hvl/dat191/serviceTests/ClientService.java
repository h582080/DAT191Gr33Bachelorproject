package hvl.dat191.serviceTests;

import java.util.List;

import hvl.dat191.model.Client;

public interface ClientService {
	
	List<Client> findAll();
	
	void insertClient(Client client);
	
	void updateClient(Client client);
	
	void executeUpdateClient(Client client);
	
	public void deleteClient(Client client);

}
