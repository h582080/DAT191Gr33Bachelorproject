package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.Client;

public class ClientRowMapper implements RowMapper<Client> {

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
