package hvl.dat191.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.ProjectdescriptionService;

@Controller
@RequestMapping("/opprettprosjekt")
public class OpprettProsjektController {
	
	@Autowired
	private ProjectdescriptionService pdsi;
	
	@PostMapping
	public void opprettProsjekt(@RequestParam String projectTitel, 
			@RequestParam String companyInfo, @RequestParam String projectDescription, 
			@RequestParam String tools, @RequestParam String language, 
			@RequestParam String programminglanguage, @RequestParam String projectType,
			@RequestParam String theme, @RequestParam String webAddress, 
			@RequestParam String contactPerson, @RequestParam String semester, 
			@RequestParam String dateOfApproval ) {
		
		Projectdescription projectdescription = new Projectdescription(
				projectTitel, 
				companyInfo,
				projectDescription,
				tools,
				language,
				programminglanguage,
				projectType,
				theme,
				webAddress,
				contactPerson,
				"WAITING",
				semester,
				dateOfApproval);
		
		pdsi.insertProjectdescription(projectdescription);
	}

	
}
