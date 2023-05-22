package hvl.dat191.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice
public class MinProfilController {
	
	@GetMapping("minProfil")
	public String minProfil () {
		return "minProfil";
	}

}
