package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.Projectdescription;

public class ProjectdescriptionRowMapper implements RowMapper<Projectdescription>{

	@Override
	public Projectdescription mapRow(ResultSet rs, int rowNum) throws SQLException {
				
			
		Projectdescription projectDsc = new Projectdescription(
						rs.getString("projectTitel"), 
						rs.getString("companyInfo"), 
						rs.getString("projectDescription"),
						rs.getString("tools"), 
						rs.getString("language"), 
						rs.getString("programminglanguage"), 
						rs.getString("projectType"),
						rs.getString("webAddress"), 
						rs.getString("contactPerson"),
						rs.getString("status"), 
						rs.getString("semester"),
						rs.getString("dateOfApproval"));
		
		return projectDsc;
	}

}
