package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.Subjectmanager;

public class SubjectmanagerRowMapper implements RowMapper<Subjectmanager>{

	@Override
	public Subjectmanager mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Subjectmanager subjectmanager = 
				new Subjectmanager(
						rs.getString("name"), 
						rs.getString("email"));
		return subjectmanager;
	}
	
	

}
