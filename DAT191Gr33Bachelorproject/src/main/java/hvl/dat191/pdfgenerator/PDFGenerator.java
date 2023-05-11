package hvl.dat191.pdfgenerator;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import hvl.dat191.model.Projectdescription;

public class PDFGenerator {

	public void generatePDF(List<Projectdescription> list) throws IOException {

		// Creating PDF document object
		PDDocument document = new PDDocument();
		
		//Laster tittelfont inn i dokumentet
		PDFont tittel = PDType0Font.load(document, new File(
				"C:/Users/Even/git/DAT191Gr33Bachelorproject/DAT191Gr33Bachelorproject/src/main/resources/fonts/cambriab.ttf"));
		
		//Forsidebilde
		PDImageXObject forside = PDImageXObject.createFromFile(
				"C:/Users/Even/git/DAT191Gr33Bachelorproject/DAT191Gr33Bachelorproject/src/main/resources/images/ForsideProsjektkatalog.png", document);
		
		//HVL-Logo
		PDImageXObject logo = PDImageXObject.createFromFile(
				"C:/Users/Even/git/DAT191Gr33Bachelorproject/DAT191Gr33Bachelorproject/src/main/resources/images/HVL-Logo.png", document);
		
		//Frontside
		PDPage front = new PDPage();
		document.addPage(front);
		PDPage page = document.getPage(0);
		PDPageContentStream contentStream = new PDPageContentStream(document, page);
		contentStream.drawImage(forside, -100, -100, 900, 1400);
		contentStream.drawImage(logo, 25, 700, 241, 63);
		contentStream.beginText();
		contentStream.setLeading(42);
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 42);
		contentStream.newLineAtOffset(100, 550);
		contentStream.showText("Bachelorprosjekt");
		contentStream.newLine();
		contentStream.showText("Data og");
		contentStream.newLine();
		contentStream.showText("Informasjonsteknologi");
		contentStream.newLine();
		//Hent semester her:
		contentStream.showText("Semester År");
		contentStream.newLine();
		
		contentStream.setLeading(18);
		contentStream.setFont(PDType1Font.TIMES_ITALIC, 18);
		contentStream.showText("Institutt for datateknologi, elektroteknologi og realfag");
		contentStream.newLine();
		contentStream.showText("Fakultet for ingeniørutdanning,");
		contentStream.newLine();
		contentStream.showText("Høgskulen på Vestlandet");
		
		contentStream.endText();
		contentStream.close();
		
		//Loop for antall prosjekter i databasen
		for(int i = 0; i < list.size(); i++) {			
		PDPage blankPage = new PDPage();
		document.addPage( blankPage );
		
		//Sett nåværende side
		page = document.getPage(i+1);
		contentStream = new PDPageContentStream(document, page);

		// Begin the Content stream
		contentStream.beginText();
		
		// Setting the leading
		contentStream.setLeading(14.5f);
		
		//Tittel
		contentStream.setFont(tittel, 16);
		contentStream.setNonStrokingColor(Color.BLUE);
		contentStream.newLineAtOffset(25, 725);
		if(list.get(i).getProjectType().equals("Intern")) {			
			contentStream.showText("IB-"+(i+1)+"\t"+list.get(i).getProjectTitel());
		}else {
			contentStream.showText("EB-"+(i+1)+"\t"+list.get(i).getProjectTitel());
		}
		System.out.println(list.get(i).getProjectType());
		
		//Prosjektbeskrivelse (Times Roman)
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream.setNonStrokingColor(Color.BLACK);
		contentStream.newLine();
		contentStream.newLine();
		contentStream.showText(list.get(i).getProjectDescription());
		
		contentStream.newLine();
		contentStream.showText("Info:");
		contentStream.newLine();
		contentStream.showText(list.get(i).getCompanyInfo());
		contentStream.newLine();
		contentStream.showText(list.get(i).getContactPerson());
		contentStream.newLine();
		contentStream.showText(list.get(i).getProgramminglanguage());
		contentStream.newLine();
		contentStream.showText(list.get(i).getTools());	
		
		// End and close the content stream
		contentStream.endText();
		contentStream.close();
		}

		// Saving the document
		document.save(new File(
				"C:/Users/Even/git/DAT191Gr33Bachelorproject/DAT191Gr33Bachelorproject/src/main/resources/my_doc.pdf"));
		System.out.println("DONE!");
		
		// Closing the document
		document.close();
	}
}
