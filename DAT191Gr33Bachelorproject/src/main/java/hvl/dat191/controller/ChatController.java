package hvl.dat191.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ControllerAdvice
public class ChatController {
	
	@GetMapping("/chat")
	public String chat() {
		
		return "chat";
	}

}
