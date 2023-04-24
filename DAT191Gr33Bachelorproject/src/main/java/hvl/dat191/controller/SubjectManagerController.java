package hvl.dat191.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hvl.dat191.model.Subjectmanager;
import hvl.dat191.service.SubjectManagerService;

@RestController
@RequestMapping("/subjectManagerApp")
public class SubjectManagerController {

	@Autowired
	private SubjectManagerService sms;
	
	@GetMapping("/subjectManagerList")
	public List<Subjectmanager> findAllSubjectmanager() {
		return sms.findAllSubjectmanager();
	}

	@PostMapping("/createSubjectManager")
	public void insertSubjectmanager(@RequestBody Subjectmanager subjectmanager) {
		sms.insertSubjectmanager(subjectmanager);
	}

	@PutMapping("/updateSubjectManager")
	public void updateSubjectmanager(@RequestBody Subjectmanager subjectmanager) {
		sms.updateSubjectmanager(subjectmanager);
	}

	@PutMapping("/executeUpdateSubjectManager")
	public void executeUpdateSubjectmanager(@RequestBody Subjectmanager subjectmanager) {
		sms.executeUpdateSubjectmanager(subjectmanager);
	}

	@DeleteMapping("/deleteSubjectManager")
	public void deleteSubjectmanager(@RequestBody Subjectmanager subjectmanager) {
		sms.deleteSubjectmanager(subjectmanager);
	}
}
