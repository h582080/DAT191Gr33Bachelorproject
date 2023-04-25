package hvl.dat191.controllerTests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Client;
import hvl.dat191.serviceTests.ClientService;

@RestController
@RequestMapping("/clientApp")
public class ClientController {

	@Autowired
	private ClientService cs;
	
	@GetMapping("/clientList")
	public List<Client> findAll() {
		return cs.findAll();
	}

	@PostMapping("/createClient")
	public void insertClient(@RequestBody Client client) {
		cs.insertClient(client);
	}

	@PutMapping("/updateClient")
	public void updateClient(@RequestBody Client client) {
		cs.updateClient(client);
	}

	@PutMapping("/executeUpdateClient")
	public void executeUpdateClient(@RequestBody Client client) {
		cs.executeUpdateClient(client);
	}

	@DeleteMapping("/deleteClient")
	public void deleteClient(@RequestBody Client client) {
		cs.deleteClient(client);
	}

}
