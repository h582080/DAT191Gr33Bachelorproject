package hvl.dat191.model;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
@Table(appliesTo = "subjectmanager")
public class Subjectmanager {
	
	@Id
	private int subjectmanagerId;
	
	private String name;
	private String email;

}
