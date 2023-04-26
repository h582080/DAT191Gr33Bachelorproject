package hvl.dat191.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hvl.dat191.service.FrontService;

@Controller
@RequestMapping("/front")
public class FrontController {
	
	@Autowired
	private FrontService fs;
	
	
	
	

}
