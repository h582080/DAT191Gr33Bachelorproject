package hvl.dat191.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.ProjectdescriptionService;

@Controller
@RequestMapping("/createprojecttest")
public class CreateProjectControllerTEST {
	
	
    private ProjectdescriptionService pdsi;
	
    @GetMapping("/projectdescription")
    public String createProjectForm(Model model) {
    	model.addAttribute("projectdescription", new Projectdescription());
    	return("projectdescription");
    }
    
    @PostMapping("/projectdescription")
    public String createProjectSubmit(
    		@ModelAttribute Projectdescription projectdescription, Model model)	{
    	model.addAttribute("projectdescription", projectdescription);
    	
    	pdsi.insertProjectdescription(projectdescription);
    	return "resulttest";
    }
    
    
  //  
//	@PostMapping("/createProject2")
//			@RequestParam String companyInfo, @RequestParam String projectDescription, 
    //			@RequestParam String tools, @RequestParam String language, 
    //			@RequestParam String programminglanguage, @RequestParam String projectType,
    //			@RequestParam String theme, @RequestParam String webAddress, 
    //			@RequestParam String contactPerson, @RequestParam String semester, 
    //			@RequestParam String dateOfApproval ) {
				//		
    //		Projectdescription projectdescription = new Projectdescription(
    //				projectTitel, 
				//				companyInfo,
    //				projectDescription,
				//				tools,
    //				language,
    //				programminglanguage,
    //				projectType,
    //				theme,
    //				webAddress,
    //				contactPerson,
    //				"WAITING",
    //				semester,
    //				dateOfApproval);
    //		
    //		pdsi.insertProjectdescription(projectdescription);
		//	}

}
