package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User user = new User (
				Integer.parseInt(rs.getString("userId")), 
				rs.getString("username"), 
				rs.getString("role"), 
				rs.getString("name"), 
				Integer.parseInt(rs.getString("phoneNr")),
				rs.getString("email"));		
		return user;
	}
	
	

}
