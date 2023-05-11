package hvl.dat191.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Client;
import hvl.dat191.service.ClientService;

@Controller
@ControllerAdvice
public class OpprettOppdragsgiverController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping("/opprettoppdragsgiver")
	public String opprettOppdragsgiver(Model model) {
		Client client = new Client();
		/*List<String> locList = Arrays.asList("Bergen", "Bergensregionen", 
		 * "Førde", "Sogn", "Vestland", "Annet");
		model.addAttribute("locList", locList);
		 */
		model.addAttribute("client", client);
		return "opprettoppdragsgiver";
	}
	
	@PostMapping("/opprettoppdragsgiver")
	public String opprettOppdragsgiver(@ModelAttribute("client") Client client) {
		service.insertClient(client);
		return "pdf";
	}

}
