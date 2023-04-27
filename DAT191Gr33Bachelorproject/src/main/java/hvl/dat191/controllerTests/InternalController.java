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

import hvl.dat191.model.Internal;
import hvl.dat191.service.InternalService;

@RestController
@RequestMapping("/internalApp")
public class InternalController {

	@Autowired
	private InternalService internalService;
	
	@GetMapping(value = "/internalList")
	public List<Internal> getInternalList(){
		return internalService.findAll();
	}
	
	@PostMapping(value ="/createInternal")
	public void createInternal(@RequestBody Internal internal) {
		internalService.insertInternal(internal);
	}
	
	@PutMapping(value = "/updateInternal")
	public void updateInternal(@RequestBody Internal internal) {
		internalService.updateInternal(internal);
	}
	
	@PutMapping(value = "/executeUpdateInternal")
	public void executeUpdateInternal(@RequestBody Internal internal) {
		internalService.executeUpdateInternal(internal);
	}
	
	@DeleteMapping(value = "/deleteInternal")
	public void deleteInternal(@RequestBody Internal internal) {
		internalService.deleteInternal(internal);
	}
}
