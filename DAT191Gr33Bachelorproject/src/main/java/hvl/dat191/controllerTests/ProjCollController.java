package hvl.dat191.controllerTests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hvl.dat191.model.Projectcollection;
import hvl.dat191.serviceTests.ProjCollService;

@RestController
@RequestMapping("/collectionApp")
public class ProjCollController {

	@Autowired
	private ProjCollService pcs;
	
	@GetMapping("/collectionList")
	public List<Projectcollection> findAll() {
		return pcs.findAll();
	}

	@PostMapping("/createCollection")
	public void insertProjectcollection(@RequestBody Projectcollection projectCl) {
		pcs.insertProjectcollection(projectCl);
	}

	@PutMapping("/updateCollection")
	public void updateProjectcollection(@RequestBody Projectcollection projectCl) {
		pcs.updateProjectcollection(projectCl);
	}

	@PutMapping("/executeUpdateCollection")
	public void executeUpdateProjectcollection(@RequestBody Projectcollection projectCl) {
		pcs.executeUpdateProjectcollection(projectCl);
	}

	@DeleteMapping("/deleteCollection")
	public void deleteProjectcollection(@RequestBody Projectcollection projectCl) {
		pcs.deleteProjectcollection(projectCl);
	}

}
