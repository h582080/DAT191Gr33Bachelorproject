package hvl.dat191.controller;

import hvl.dat191.model.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice
public class ProjectAdministrationController {
	
	
	@GetMapping("/projectadministration")
	public String listOfProjects(Model model) {
		
		
		return("allprojects");
		
	}
	
	
	
	

}
