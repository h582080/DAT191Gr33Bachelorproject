package hvl.dat191.controllerTests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.ProjectdescriptionService;

@RestController
@RequestMapping("/projectdescriptionApp")
public class ProjectdescriptionController {

	@Autowired
	private ProjectdescriptionService pds;
	
	@GetMapping("/projectdescriptionList")
	public List<Projectdescription> findAllProjectdescription() {
		return pds.findAllProjectdescription();
	}

	@PostMapping("/createProjectdescription")
	public void insertProjectdescription(@RequestBody Projectdescription projectDsc) {
		pds.insertProjectdescription(projectDsc);
	}

	@PutMapping("/updateProjectdescription")
	public void updateProjectdescription(@RequestBody Projectdescription projectDsc) {
		pds.updateProjectdescription(projectDsc);
	}

	@PutMapping("/executeUpdateProjectdescription")
	public void executeUpdateProjectdescription(@RequestBody Projectdescription projectDsc) {
		pds.executeUpdateProjectdescription(projectDsc);
	}

	@DeleteMapping("/deleteProjectdescription")
	public void deleteProjectdescription(@RequestBody Projectdescription projectDsc) {
		pds.deleteProjectdescription(projectDsc);
	}
}
