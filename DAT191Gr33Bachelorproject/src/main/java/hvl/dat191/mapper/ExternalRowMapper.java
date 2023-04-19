package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.External;

public class ExternalRowMapper implements RowMapper<External> {

	@Override
	public External mapRow(ResultSet rs, int rowNum) throws SQLException {
		External ext = new External(
				rs.getInt("externalId"),
				rs.getString("name"),
				rs.getString("companyNavn"),
				rs.getInt("phoneNr"),
				rs.getString("email")
				);
		return ext;
	}

}
