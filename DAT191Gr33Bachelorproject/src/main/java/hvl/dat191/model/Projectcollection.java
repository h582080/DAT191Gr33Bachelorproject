package hvl.dat191.model;


import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
@Table(name = "projectcollection")
public class Projectcollection {
	
	@Id
	private int collectionId;
	
	private int template;
	private String collectionTitle;
	private String semester;
	
	public Projectcollection(int id, int template, String collectionTitle, String semester) {
		this.collectionId = id;
		this.template = template;
		this.collectionTitle = collectionTitle;
		this.semester = semester;
	}

	public int getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(int collectionId) {
		this.collectionId = collectionId;
	}

	public int getTemplate() {
		return template;
	}

	public void setTemplate(int template) {
		this.template = template;
	}

	public String getCollectionTitle() {
		return collectionTitle;
	}

	public void setCollectionTitle(String collectionTitle) {
		this.collectionTitle = collectionTitle;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	
	
	

}
