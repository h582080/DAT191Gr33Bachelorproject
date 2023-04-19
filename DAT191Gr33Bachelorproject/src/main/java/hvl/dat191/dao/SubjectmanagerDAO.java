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

import hvl.dat191.daointerface.SubjectmanagerDAOInterface;
import hvl.dat191.mapper.SubjectmanagerRowMapper;
import hvl.dat191.model.Subjectmanager;

@Repository
public class SubjectmanagerDAO implements SubjectmanagerDAOInterface {

	public SubjectmanagerDAO (NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	NamedParameterJdbcTemplate template;
	
	@Override
	public List<Subjectmanager> findAllSubjectmanager() {
		return template.query("select * from subjectmanager", new SubjectmanagerRowMapper());
	}

	@Override
	public void insertSubjectmanager(Subjectmanager subjectmanager) {
		final String sql = "insert into subjectmanager(subjectmanagerId, name, email) values (:subjectmanagerId,:name,:email)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("subjectmanagerId", subjectmanager.getSubjectmanagerId())
				.addValue("name", subjectmanager.getName())
				.addValue("email", subjectmanager.getEmail());
		template.update(sql,param,holder);
	}

	@Override
	public void updateSubjectmanager(Subjectmanager subjectmanager) {
		final String sql = "update subjectmanager set subjectmanagerId=:subjectmanagerId, name=:name, email=:email where subjectmanagerId=:subjectmanagerId";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("subjectmanagerId", subjectmanager.getSubjectmanagerId())
				.addValue("name", subjectmanager.getName())
				.addValue("email", subjectmanager.getEmail());
		template.update(sql,param,holder);
		
	}

	@Override
	public void executeUpdateSubjectmanager(Subjectmanager subjectmanager) {
		final String sql = "update subjectmanager set subjectmanagerId=:subjectmanagerId, name=:name, email=:email where subjectmanagerId=:subjectmanagerId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("subjectmanagerId", subjectmanager.getSubjectmanagerId());
		map.put("name", subjectmanager.getName());
		map.put("email", subjectmanager.getEmail());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		     }
		});
		
	}

	@Override
	public void deleteSubjectmanager(Subjectmanager subjectmanager) {
		final String sql = "delete from subjectmanager where subjectmanagerId=:subjectmanagerId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("subjectmanagerId", subjectmanager.getSubjectmanagerId());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		}); 
		
		
	}

}
