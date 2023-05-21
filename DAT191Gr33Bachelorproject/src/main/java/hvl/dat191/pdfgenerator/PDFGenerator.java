package hvl.dat191.pdfgenerator;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import hvl.dat191.model.Projectdescription;

public class PDFGenerator {

	private PDImageXObject forside;
	private PDImageXObject logo;
	
	public void generatePDFProject(Projectdescription pd) throws IOException{
		
		// Creating PDF document object
		PDDocument document = new PDDocument();
				
		PDPage page = new PDPage();
		document.addPage( page );
		
		//Sett nåværende side
		PDPageContentStream contentStream = new PDPageContentStream(document, page);

		// Begin the Content stream
		contentStream.beginText();
		
		// Setting the leading
		contentStream.setLeading(14.5f);
		
		//Tittel
		contentStream.setFont(PDType1Font.TIMES_BOLD, 16);
		contentStream.setNonStrokingColor(Color.BLUE);
		contentStream.newLineAtOffset(25, 725);
		if(pd.getProjectType().equals("Intern")) {			
			contentStream.showText("IB-"+(1)+" "+pd.getProjectTitel());
		}else {
			contentStream.showText("EB-"+(1)+" "+pd.getProjectTitel());
		}
		
		//Prosjektbeskrivelse (Times Roman)
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream.setNonStrokingColor(Color.BLACK);
		contentStream.newLine();
		contentStream.newLine();
		
		String[] companyInfo = pd.getCompanyInfo().split("\n");
		for(String textLine : companyInfo) {
			writeLine(document, contentStream, textLine);
		}
		
		contentStream.newLine();
		contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
		contentStream.showText("Oppgave:");
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream.newLine();
		
		int countLines = 0;
		String[] listText = pd.getProjectDescription().split("\n");
		
		
		for (String textLine : listText) {
			if(countLines == 25) {
				contentStream.endText();
				contentStream.close();
				countLines = 0;
				contentStream = returnNewPageContent(document);
			}
			
			writeLine(document, contentStream, textLine);
			countLines += 1;
		}
		
		List<Projectdescription> list = Arrays.asList(pd);
		
		writeInfo(contentStream, 0, list);	
		
		// End and close the content stream
		contentStream.endText();
		contentStream.close();
		
		// Saving the document
		document.save(new File(
				"C:/Users/Even/git/DAT191Gr33Bachelorproject/DAT191Gr33Bachelorproject/src/main/resources/Projectdesc.pdf"));
		System.out.println("DONE!");
		
		// Closing the document
		document.close();
	}
	
	public void generatePDFKatalog(List<Projectdescription> list) throws IOException {

		// Creating PDF document object
		PDDocument document = new PDDocument();
		
		//Forsidebilde
		forside = PDImageXObject.createFromFile(
				"C:/Users/Even/git/DAT191Gr33Bachelorproject/DAT191Gr33Bachelorproject/src/main/resources/images/ForsideProsjektkatalog.png", document);
		
		//HVL-Logo
		logo = PDImageXObject.createFromFile(
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
		{
			
		}
		//Loop for antall prosjekter i databasen
		for(int i = 0; i < list.size(); i++) {			
		PDPage blankPage = new PDPage();
		document.addPage( blankPage );
		
		//Sett nåværende side
		contentStream = new PDPageContentStream(document, blankPage);

		// Begin the Content stream
		contentStream.beginText();
		
		// Setting the leading
		contentStream.setLeading(14.5f);
		
		//Tittel
		contentStream.setFont(PDType1Font.TIMES_BOLD, 16);
		contentStream.setNonStrokingColor(Color.BLUE);
		contentStream.newLineAtOffset(25, 725);
		if(list.get(i).getProjectType().equals("Intern")) {			
			contentStream.showText("IB-"+(i+1)+" "+list.get(i).getProjectTitel());
		}else {
			contentStream.showText("EB-"+(i+1)+" "+list.get(i).getProjectTitel());
		}
		
		//Prosjektbeskrivelse (Times Roman)
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream.setNonStrokingColor(Color.BLACK);
		contentStream.newLine();
		contentStream.newLine();
		
		String[] companyInfo = list.get(i).getCompanyInfo().split("\n");
		for(String textLine : companyInfo) {
			writeLine(document, contentStream, textLine);
		}
		
		contentStream.newLine();
		contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
		contentStream.showText("Oppgave:");
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 11);
		contentStream.newLine();
		
		int countLines = 0;
		String[] listText = list.get(i).getProjectDescription().split("\n");
		
		
		for (String textLine : listText) {
			if(countLines == 25) {
				contentStream.endText();
				contentStream.close();
				countLines = 0;
				contentStream = returnNewPageContent(document);
			}
			
			writeLine(document, contentStream, textLine);
			countLines += 1;
		}
		
		writeInfo(contentStream, i, list);	
		
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
	
	private void writeLine(PDDocument doc, PDPageContentStream contentStream, String textLine) throws IOException {
		textLine = textLine.replaceAll("\t", " ");
		if(textLine.startsWith(" ")){
			textLine = textLine.replaceFirst(" ", "");
		}
        contentStream.showText(textLine);
        contentStream.newLine();
    }
	
    private PDPageContentStream returnNewPageContent(PDDocument doc) throws IOException {
        PDPage page = new PDPage();
        doc.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(doc, page);
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 11);
        contentStream.setLeading(14.5f);
        contentStream.beginText();
        contentStream.newLineAtOffset(25, 700);

        return contentStream;
    }
    
	private void writeInfo(PDPageContentStream stream, int i, List<Projectdescription> list) throws IOException {
		stream.newLine();
		stream.showText("Info:");
		stream.newLine();
		String contactPerson = list.get(i).getContactPerson();
		String programmingLanguage = list.get(i).getProgramminglanguage();
		String tools = list.get(i).getTools();
		contactPerson = contactPerson.replaceAll("\n", " - ").replaceAll("\t", " ").replaceAll("\r", "");
		stream.showText(contactPerson);
		stream.newLine();
		programmingLanguage = programmingLanguage.replaceAll("\n", "-").replaceAll("\t", " ").replaceAll("\r", "");		
		stream.showText(programmingLanguage);
		stream.newLine();
		tools = tools.replaceAll("\n", "-").replaceAll("\t", " ").replaceAll("\r", "");		
		stream.showText(tools);
	}
}
