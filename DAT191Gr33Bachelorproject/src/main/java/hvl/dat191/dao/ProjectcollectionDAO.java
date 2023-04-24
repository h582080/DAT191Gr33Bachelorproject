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


import hvl.dat191.daointerface.ProjectcollectionDAOInterface;
import hvl.dat191.model.Projectcollection;
import hvl.dat191.mapper.ProjCollRowMapper;

@Repository
public class ProjectcollectionDAO implements ProjectcollectionDAOInterface {

	NamedParameterJdbcTemplate template;

	public ProjectcollectionDAO(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<Projectcollection> findAll() {
		return template.query("select * from projectcollection", new ProjCollRowMapper());
	}

	@Override
	public void insertProjectcollection(Projectcollection projectCl) {
		final String sql = "insert into projectcollection(collectionId, template, collectionTitle, semester) values(:collectionId,:template,:collectionTitle,:semester)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("collectionId", projectCl.getCollectionId())
				.addValue("template", projectCl.getTemplate())
				.addValue("collectionTitle", projectCl.getCollectionTitle())
				.addValue("semester", projectCl.getSemester());
		template.update(sql, param, holder);
	}

	@Override
	public void updateProjectcollection(Projectcollection projectCl) {
		final String sql = "update projectcollection set template=:template, collectionTitle=:collectionTitle, semester=:semester where collectionId=:collectionId";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("collectionId", projectCl.getCollectionId())
				.addValue("template", projectCl.getTemplate())
				.addValue("collectionTitle", projectCl.getCollectionTitle())
				.addValue("semester", projectCl.getSemester());
		template.update(sql, param, holder);	
	}

	@Override
	public void executeUpdateProjectcollection(Projectcollection projectCl) {
		final String sql = "update projectcollection set template=:template, collectionTitle=:collectionTitle, semester=:semester where collectionId=:collectionId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("collectionId", projectCl.getCollectionId());
		map.put("template", projectCl.getTemplate());
		map.put("collectionTitle", projectCl.getCollectionTitle());
		map.put("semester", projectCl.getSemester());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException{
				return ps.executeUpdate();
			}
		});
		
	}

	@Override
	public void deleteProjectcollection(Projectcollection projectCl) {
		final String sql = "delete from projectcollection where collectionId=:collectionId";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("collectionId", projectCl.getCollectionId());
		
		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException{
				return ps.executeUpdate();
			}
		});
	}

}
