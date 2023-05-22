package hvl.dat191.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.ProjectdescriptionService;

@Controller
@ControllerAdvice
public class OpprettProsjektController {
	
	@Autowired
	private ProjectdescriptionService service;
	
	@GetMapping("/opprettprosjekt") 
    public String opprettProsjekt(Model model) {
    	model.addAttribute("projectdescription", new Projectdescription());
    	return "opprettprosjekt";
    }
    
    @PostMapping("/opprettprosjekt")
    public String opprettProsjekt(@ModelAttribute("projectdescription") 
        Projectdescription projectdescription)	{  
    	
    	service.insertProjectdescription(projectdescription);   	
    	return "pdf";
    }
}
	

	

