package hvl.dat191.model;


import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
@Table(name = "projectcollection")
public class Projectcollection {
	
	@Id
	private String collectionId;
	
	private int template;
	private String collectionTitel;
	private String semester;
	
	public Projectcollection(String collectionId, int template, String collectionTitel, String semester) {
		this.collectionId = collectionId;
		this.template = template;
		this.collectionTitel = collectionTitel;
		this.semester = semester;
	}

	public String getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public int getTemplate() {
		return template;
	}

	public void setTemplate(int template) {
		this.template = template;
	}

	public String getCollectionTitel() {
		return collectionTitel;
	}

	public void setCollectionTitel(String collectionTitel) {
		this.collectionTitel = collectionTitel;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	
	
	

}
