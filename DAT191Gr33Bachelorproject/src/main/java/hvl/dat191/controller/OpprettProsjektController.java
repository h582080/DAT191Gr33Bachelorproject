package hvl.dat191.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.OpprettProsjektService;

@Controller
@RequestMapping("/opprettprosjekt")
public class OpprettProsjektController {
	
	@Autowired
	private OpprettProsjektService ops;

	@PostMapping
	public void opprettProsjekt(Projectdescription prjdsc) {
		//TODO
	}
}
