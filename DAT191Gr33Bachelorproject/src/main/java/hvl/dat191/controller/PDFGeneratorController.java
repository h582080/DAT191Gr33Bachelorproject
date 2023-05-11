package hvl.dat191.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import hvl.dat191.service.ProjectdescriptionService;
import hvl.dat191.model.*;
import hvl.dat191.pdfgenerator.*;

@Controller
@ControllerAdvice
public class PDFGeneratorController {
	
	@Autowired
	private ProjectdescriptionService psdi;
	private PDFGenerator g = new PDFGenerator();
	
	@GetMapping("/pdfgenerator")
	public String pdfgenerator() {
		try {
			g.generatePDF(psdi.findAllProjectdescription());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "pdfgenerator";
	}

}
