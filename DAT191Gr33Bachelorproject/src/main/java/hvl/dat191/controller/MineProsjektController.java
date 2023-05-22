package hvl.dat191.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hvl.dat191.model.Projectcollection;

@Controller
@ControllerAdvice
public class MineProsjektController {
	
	@GetMapping("mineprosjekt")
	public String userProjects() {
		return "mineprosjekt";
	}
	
	
	
	
	
	
	
	

}
