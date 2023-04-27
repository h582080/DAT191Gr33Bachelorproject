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

import hvl.dat191.daointerface.ProjectdescriptionDAOInterface;
import hvl.dat191.model.Projectdescription;
import hvl.dat191.mapper.ProjectdescriptionRowMapper;


@Repository
public class ProjectdescriptionDAO implements ProjectdescriptionDAOInterface {

	
	public ProjectdescriptionDAO (NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	NamedParameterJdbcTemplate template;
	
	@Override
	public List<Projectdescription> findAllProjectdescription() {
		
		return template.query ("select * from projectdescription", new ProjectdescriptionRowMapper());
		
	}

	@Override
	public void insertProjectdescription(Projectdescription projectDsc) {
		final String sql = "insert into projectdescription(projectId, projectTitel, companyInfo, projectDescription, tools, language, programminglanguage, projectType, theme, webAddress, contactPerson, status, semester, dateOfApproval) values(:projectId,:projectTitel,:companyInfo,:projectDescription,:tools,:language,:programminglanguage,:projectType,:theme,:webAddress,:contactPerson,:status,:semester,:dateOfApproval)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("projectId", projectDsc.getProjectId())
				.addValue("projectTitel", projectDsc.getProjectTitel())
				.addValue("companyInfo", projectDsc.getCompanyInfo())
				.addValue("projectDescription", projectDsc.getProjectDescription())
				.addValue("tools", projectDsc.getTools())
				.addValue("language", projectDsc.getLanguage())
				.addValue("programminglanguage", projectDsc.getProgrammingLanguage())
				.addValue("projectType", projectDsc.getProjectType())
				.addValue("theme", projectDsc.getTheme())
				.addValue("webAddress", projectDsc.getWebAddress())
				.addValue("contactPerson", projectDsc.getContactPerson())
				.addValue("status", projectDsc.getStatus())
				.addValue("semester", projectDsc.getSemester())
				.addValue("dateOfApproval", projectDsc.getDateOfApproval());
		template.update(sql,param,holder);
	}

	@Override
	public void updateProjectdescription(Projectdescription projectDsc) {
		final String sql = "update projectdescription set projectId=:projectId, projectTitel=:projectTitel, companyInfo=:companyInfo, projectDescription=:projectDescription, tools=:tools, language=:language, programminglanguage=:programminglanguage, projectType=:projectType, theme=:theme, webAddress=:webAddress, contactPerson=:contactPerson, status=:status, semester=:semester, dateOfApproval=:dateOfApproval where projectId=:projectId";
		
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("projectId", projectDsc.getProjectId())
				.addValue("projectTitel", projectDsc.getProjectTitel())
				.addValue("companyInfo", projectDsc.getCompanyInfo())
				.addValue("projectDescription", projectDsc.getProjectDescription())
				.addValue("tools", projectDsc.getTools())
				.addValue("language", projectDsc.getLanguage())
				.addValue("programminglanguage", projectDsc.getProgrammingLanguage())
				.addValue("projectType", projectDsc.getProjectType())
				.addValue("theme", projectDsc.getTheme())
				.addValue("webAddress", projectDsc.getWebAddress())
				.addValue("contactPerson", projectDsc.getContactPerson())
				.addValue("status", projectDsc.getStatus())
				.addValue("semester", projectDsc.getSemester())
				.addValue("dateOfApproval", projectDsc.getDateOfApproval());
		template.update(sql,param,holder);
		
	}

	@Override
	public void executeUpdateProjectdescription(Projectdescription projectDsc) {
		final String sql = "update projectdescription set projectId=:projectId, projectTitel=:projectTitel, companyInfo=:companyInfo, projectDescription=:projectDescription, tools=:tools, language=:language, programminglanguage=:programminglanguage, projectType=:projectType, theme=:theme, webAddress=:webAddress, contactPerson=:contactPerson, status=:status, semester=:semester, dateOfApproval=:dateOfApproval where projectId=:projectId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("projectId", projectDsc.getProjectId());
		map.put("projectTitel", projectDsc.getProjectTitel());
		map.put("companyInfo", projectDsc.getCompanyInfo());
		map.put("projectDescription", projectDsc.getProjectDescription());
		map.put("tools", projectDsc.getTools());
		map.put("language", projectDsc.getLanguage());
		map.put("programminglanguage", projectDsc.getProgrammingLanguage());
		map.put("projectType", projectDsc.getProjectType());
		map.put("theme", projectDsc.getTheme());
		map.put("webAddress", projectDsc.getWebAddress());
		map.put("contactPerson", projectDsc.getContactPerson());
		map.put("status", projectDsc.getStatus());
		map.put("semester", projectDsc.getSemester());
		map.put("dateOfApproval", projectDsc.getDateOfApproval());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		     }
		});
	}

	@Override
	public void deleteProjectdescription(Projectdescription projectDsc) {
		final String sql = "delete from projectdescription where projectId=:projectId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("projectId", projectDsc.getProjectId());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		     }
		});
		
	}

}
