package hvl.dat191.daointerface;

import java.util.List;

import hvl.dat191.model.Client;

public interface ClientDAOInterface {
	
	List<Client> findAll();
	
	void insertClient(Client client);
	
	void updateClient(Client client);
	
	void executeUpdateClient(Client client);
	
	public void deleteClient(Client client);

}
