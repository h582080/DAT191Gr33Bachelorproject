package hvl.dat191.model;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;


@Entity
@Table(appliesTo = "user")
public class User {
	
	@Id
	private int userId;
	
	private String username;
	private String role;
	private String name;
	private int phoneNr;
	private String email;
	public User(int userId, String username, String role, String name, int phoneNr, String email) {
		this.userId = userId;
		this.username = username;
		this.role = role;
		this.name = name;
		this.phoneNr = phoneNr;
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNr() {
		return phoneNr;
	}
	public void setPhoneNr(int phoneNr) {
		this.phoneNr = phoneNr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
