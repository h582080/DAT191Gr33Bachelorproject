package hvl.dat191.model;

import java.sql.Date;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
@Table(appliesTo = "projectdescription")
public class Projectdescription {
	
	@Id
	private int projectId;
	
	private String projectTitel;
	private String companyInfo;
	private String projectDescription;
	private String tools;
	private String language;
	private String programmingLanguage;
	private String projectType;
	private String webAddress;
	private String contactPerson;
	private String status;
	private String semester;
	private Date dateOfApproval;
	
	public Projectdescription(int projectId, String projectTitel, String companyInfo, String projectDescription,
			String tools, String language, String programmingLanguage, String projectType, String webAddress,
			String contactPerson, String status, String semester, Date dateOfApproval) {
		this.projectId = projectId;
		this.projectTitel = projectTitel;
		this.companyInfo = companyInfo;
		this.projectDescription = projectDescription;
		this.tools = tools;
		this.language = language;
		this.programmingLanguage = programmingLanguage;
		this.projectType = projectType;
		this.webAddress = webAddress;
		this.contactPerson = contactPerson;
		this.status = status;
		this.semester = semester;
		this.dateOfApproval = dateOfApproval;
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
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
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
	public Date getDateOfApproval() {
		return dateOfApproval;
	}
	public void setDateOfApproval(Date dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}
	
	
	
	

}
