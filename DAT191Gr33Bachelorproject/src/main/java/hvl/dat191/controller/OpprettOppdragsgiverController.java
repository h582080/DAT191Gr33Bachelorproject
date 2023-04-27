package hvl.dat191.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Client;
import hvl.dat191.service.ClientService;

@Controller
public class OpprettOppdragsgiverController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping("/opprettoppdragsgiver")
	public String opprettOppdragsgiver(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "opprettoppdragsgiver";
	}
	
	@PostMapping
	public void opprettOppdragsgiver(@RequestParam String name,
			@RequestParam String companyName,
			@RequestParam int phoneNr,
			@RequestParam String email) {
		
		Client client = new Client(
				name,
				companyName,
				phoneNr,
				email,
				5,
				"External"
				);
		service.insertClient(client);
	}

}
