package hvl.dat191.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import hvl.dat191.daointerface.ExternalDAOInterface;
import hvl.dat191.model.External;
import hvl.dat191.mapper.ExternalRowMapper;

@Repository
public class ExternalDAO implements ExternalDAOInterface {

	NamedParameterJdbcTemplate template;

	public ExternalDAO(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<External> findAll() {
		return template.query("select * from external", new ExternalRowMapper());
	}

	@Override
	public void insertExternal(External ext) {
		
		final String sql = "insert into external(externalId, name, companyName, phoneNr, email) values(:externalId,:name,:companyName,:phoneNr,:email)";
	
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("externalId", ext.getExternalId())
				.addValue("name", ext.getName())
				.addValue("companyName", ext.getCompanyName())
				.addValue("phoneNr", ext.getPhoneNr())
				.addValue("email", ext.getEmail());
		template.update(sql, param, holder);
	}

	@Override
	public void updateExternal(External ext) {
		
		final String sql = "update external set name=:name, companyName=:companyName, phoneNr=:phoneNr, email=:email where externalId=:externalId";
	
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("externalId", ext.getExternalId())
				.addValue("name", ext.getName())
				.addValue("companyName", ext.getCompanyName())
				.addValue("phoneNr", ext.getPhoneNr())
				.addValue("email", ext.getEmail());
		template.update(sql, param, holder);

		
	}

	@Override
	public void executeUpdateExternal(External ext) {
		final String sql = "update external set name=:name, companyName=:companyName, phoneNr=:phoneNr, email=:email where externalId=:externalId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("externalId", ext.getExternalId());
		map.put("name", ext.getName());
		map.put("companyName", ext.getCompanyName());
		map.put("phoneNr", ext.getPhoneNr());
		map.put("email", ext.getEmail());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException{
				return ps.executeUpdate();
			}
		});
	}

	@Override
	public void deleteExternal(External ext) {
		final String sql = "delete from external where externalId=:externalId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("externalId", ext.getExternalId());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}

}
