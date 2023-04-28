package hvl.dat191.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.ProjectdescriptionService;

@Controller
@RequestMapping("/createprojecttest")
public class CreateProjectControllerTEST {
	
	private ProjectdescriptionService pdsi;
	
	@GetMapping("/projectdescription") 
    public String createProjectForm(Model model) {
    	model.addAttribute("projectdescription", new Projectdescription());
    	return "projectdescription";
    }
    
    @PostMapping("/projectdescription")
    public String createProjectSubmit(@ModelAttribute Projectdescription projectdescription, Model model)	{
    	model.addAttribute("projectdescription", projectdescription);   	
    	return "resulttest";
    }
    

}
