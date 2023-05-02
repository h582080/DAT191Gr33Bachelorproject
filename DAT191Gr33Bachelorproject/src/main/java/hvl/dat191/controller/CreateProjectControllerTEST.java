package hvl.dat191.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.ProjectdescriptionService;

@Controller
@ControllerAdvice
public class CreateProjectControllerTEST {
	
	@Autowired
	private ProjectdescriptionService service;
	
	@GetMapping("/createprojecttest") 
    public String createProjectForm(Model model) {
    	model.addAttribute("projectdescription", new Projectdescription());
    	return "createprojecttest";
    }
    
    @PostMapping("/createprojecttest")
    public String createProjectSubmit(@ModelAttribute("projectdescription") 
        Projectdescription projectdescription)	{  
    	
    	service.insertProjectdescription(projectdescription);   	
    	return "resulttest";
    }
    

}
