package hvl.dat191.dao;

import java.util.List;

import hvl.dat191.daointerface.ClientDAOInterface;
import hvl.dat191.model.Client;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

public class ClientDAO implements ClientDAOInterface{

	public ClientDAO(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	NamedParameterJdbcTemplate template;
	
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdateClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClient(Client client) {
		// TODO Auto-generated method stub
		
	}

}
