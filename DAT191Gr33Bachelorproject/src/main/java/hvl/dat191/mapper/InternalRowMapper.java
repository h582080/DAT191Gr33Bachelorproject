package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.Internal;

public class InternalRowMapper implements RowMapper<Internal> {

	@Override
	public Internal mapRow(ResultSet rs, int rowNum) throws SQLException {
		Internal internal = new Internal(
				rs.getString("name"),
				rs.getInt("phoneNr"),
				rs.getString("email")
				);
		return internal;
	}

}