package hvl.dat191.model;

import java.sql.Date;


import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "projectdescription")
public class Projectdescription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int projectId;
	
	private String projectTitel;
	private String companyInfo;
	private String projectDescription;
	private String tools;
	private String language;
	private String programminglanguage;
	private String projectType;
	private String theme;
	private String webAddress;
	private String contactPerson;
	private String status;
	private String semester;
	private String dateOfApproval;
	
	
	
	public Projectdescription() {
		
	}
	
	public Projectdescription(String projectTitel, String companyInfo, String projectDescription,
			String tools, String language, String programminglanguage, String projectType, 
			String theme, String webAddress, String contactPerson, String status, 
			String semester, String dateOfApproval) {
		this.projectTitel = projectTitel;
		this.companyInfo = companyInfo;
		this.projectDescription = projectDescription;
		this.tools = tools;
		this.language = language;
		this.programminglanguage = programminglanguage;
		this.projectType = projectType;
		this.theme = theme;
		this.webAddress = webAddress;
		this.contactPerson = contactPerson;
		this.status = status;
		this.semester = semester;
		this.dateOfApproval = dateOfApproval;
	}
	public String getProgramminglanguage() {
		return programminglanguage;
	}

	public void setProgramminglanguage(String programminglanguage) {
		this.programminglanguage = programminglanguage;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectTitel() {
		return projectTitel;
	}
	public void setProjectTitel(String projectTitel) {
		this.projectTitel = projectTitel;
	}
	public String getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getProgrammingLanguage() {
		return programminglanguage;
	}
	public void setProgrammingLanguage(String programminglanguage) {
		this.programminglanguage = programminglanguage;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getDateOfApproval() {
		return dateOfApproval;
	}
	public void setDateOfApproval(String dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}
	
	
	
	

}
