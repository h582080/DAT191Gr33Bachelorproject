package hvl.dat191.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hvl.dat191.daointerface.ClientDAOInterface;
import hvl.dat191.mapper.ClientRowMapper;
import hvl.dat191.model.Client;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO implements ClientDAOInterface{

	public ClientDAO(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	NamedParameterJdbcTemplate template;
	
	@Override
	public List<Client> findAll() {
		return template.query("select * from client", new ClientRowMapper());
	}

	@Override
	public void insertClient(Client client) {
		final String sql = "insert into client(name, companyName, phoneNr, email, maxNumberOfProjectsSemester, clientType) "
				+ "values(:name,:companyName,:phoneNr,:email,:maxNumberOfProjectsSemester,:clientType)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("name", client.getName())
				.addValue("companyName", client.getCompanyName())
				.addValue("phoneNr", client.getPhoneNr())
				.addValue("email", client.getEmail())
				.addValue("maxNumberOfProjectsSemester", client.getMaxNumberOfProjectsSemester())
				.addValue("clientType", client.getClientType());
		template.update(sql, param, holder);	
	}

	@Override
	public void updateClient(Client client) {
		final String sql = "update client set name=:name, companyName=:companyName, phoneNr=:phoneNr, email=:email,"
				+ " maxNumberOfProjectsSemester=:maxNumberOfProjectsSemester, clientType=:clientType where clientId=:clientId";

		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("clientId", client.getClientId())
				.addValue("name", client.getName())
				.addValue("companyName", client.getCompanyName())
				.addValue("phoneNr", client.getPhoneNr())
				.addValue("email", client.getEmail())
				.addValue("maxNumberOfProjectsSemester", client.getMaxNumberOfProjectsSemester())
				.addValue("clientType", client.getClientType());
		template.update(sql, param, holder);
	}

	@Override
	public void executeUpdateClient(Client client) {
		final String sql = "update client set name=:name, companyName=:companyName, phoneNr=:phoneNr, email=:email,"
				+ " maxNumberOfProjectsSemester=:maxNumberOfProjectsSemester, clientType=:clientType where clientId=:clientId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("clientId", client.getClientId());
		map.put("name", client.getName());
		map.put("companyName", client.getCompanyName());
		map.put("phoneNr", client.getPhoneNr());
		map.put("email", client.getEmail());
		map.put("maxNumberOfProjectsSemester", client.getMaxNumberOfProjectsSemester());
		map.put("clientType", client.getClientType());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException{
				return ps.executeUpdate();
			}
		});		
	}

	@Override
	public void deleteClient(Client client) {
		final String sql = "delete from client where clientId=:clientId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("clientId", client.getClientId());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException{
				return ps.executeUpdate();
			}
		});		
	}

}
