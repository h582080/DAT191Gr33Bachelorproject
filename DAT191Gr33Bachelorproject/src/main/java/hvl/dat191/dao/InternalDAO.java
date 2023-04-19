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

import hvl.dat191.daointerface.InternalDAOInterface;
import hvl.dat191.model.Internal;
import hvl.dat191.mapper.InternalRowMapper;

@Repository
public class InternalDAO implements InternalDAOInterface{

	NamedParameterJdbcTemplate template;

	public InternalDAO(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<Internal> findAll() {
		return template.query("select * from internal", new InternalRowMapper());
	}

	@Override
	public void insertInternal(Internal internal) {
		final String sql = "insert into internal(internalId, name, phoneNr, email) values(:internalId,:name,:phoneNr,:email)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("internalId", internal.getInternalId())
				.addValue("name", internal.getName())
				.addValue("phoneNr", internal.getPhoneNr())
				.addValue("email", internal.getEmail());
		template.update(sql, param, holder);
	}

	@Override
	public void updateInternal(Internal internal) {
		
		final String sql = "update internal set name=:name, phoneNr=:phoneNr, email=:email where internalId=:internalId";
	
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("internalId", internal.getInternalId())
				.addValue("name", internal.getName())
				.addValue("phoneNr", internal.getPhoneNr())
				.addValue("email", internal.getEmail());
		template.update(sql, param, holder);

	}

	@Override
	public void executeUpdateInternal(Internal internal) {
		final String sql = "update internal set name=:name, phoneNr=:phoneNr, email=:email where internalId=:internalId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("internalId", internal.getInternalId());
		map.put("name", internal.getName());
		map.put("phoneNr", internal.getPhoneNr());
		map.put("email", internal.getEmail());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException{
				return ps.executeUpdate();
			}
		});

	}

	@Override
	public void deleteInternal(Internal internal) {
		final String sql = "delete from internal where internalId=:internalId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("internalId", internal.getInternalId());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}

}
