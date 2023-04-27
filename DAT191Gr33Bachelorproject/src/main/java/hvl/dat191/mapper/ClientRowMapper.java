package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.Client;

public class ClientRowMapper implements RowMapper<Client> {

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client cl = new Client(
				rs.getString("name"),
				rs.getString("companyName"),
				rs.getInt("phoneNr"),
				rs.getString("email"),
				rs.getInt("maxNumberOfProjectsSemester"),
				rs.getString("clientType")
				);
		return cl;
	}

}
