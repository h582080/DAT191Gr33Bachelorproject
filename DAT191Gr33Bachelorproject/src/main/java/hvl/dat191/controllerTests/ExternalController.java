package hvl.dat191.controllerTests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hvl.dat191.model.External;
import hvl.dat191.serviceTests.ExternalService;


@RestController
@RequestMapping("/externalApp")
public class ExternalController {

	@Autowired
	private ExternalService externalService;
	
	@GetMapping(value = "/externalList")
	public List<External> getExternalList(){
		return externalService.findAll();
	}
	
	@PostMapping(value ="/createExternal")
	public void createExternal(@RequestBody External external) {
		externalService.insertExternal(external);
	}
	
	@PutMapping(value = "/updateExternal")
	public void updateExternal(@RequestBody External external) {
		externalService.updateExternal(external);
	}
	
	@PutMapping(value = "/executeUpdateExternal")
	public void executeUpdateExternal(@RequestBody External external) {
		externalService.executeUpdateExternal(external);
	}
	
	@DeleteMapping(value = "/deleteExternal")
	public void deleteExternal(@RequestBody External external) {
		externalService.deleteExternal(external);
	}
}
