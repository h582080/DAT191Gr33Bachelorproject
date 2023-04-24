package hvl.dat191.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.ClientDAO;
import hvl.dat191.model.Client;
import hvl.dat191.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDao;
	
	@Override
	public List<Client> findAll() {
		return clientDao.findAll();
	}

	@Override
	public void insertClient(Client client) {
		clientDao.insertClient(client);
	}

	@Override
	public void updateClient(Client client) {
		clientDao.updateClient(client);
	}

	@Override
	public void executeUpdateClient(Client client) {
		clientDao.executeUpdateClient(client);
	}

	@Override
	public void deleteClient(Client client) {
		clientDao.deleteClient(client);
	}

}
