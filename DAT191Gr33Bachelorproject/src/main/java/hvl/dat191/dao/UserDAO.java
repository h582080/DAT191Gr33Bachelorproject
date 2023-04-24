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

import hvl.dat191.daointerface.UserDAOInterface;
import hvl.dat191.mapper.UserRowMapper;
import hvl.dat191.model.User;

@Repository
public class UserDAO implements UserDAOInterface{
	
	public UserDAO (NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	NamedParameterJdbcTemplate template;

	@Override
	public List<User> findAllUser() {
		return template.query ("select * from users", new UserRowMapper());
	}

	@Override
	public void insertUser(User user) {
		final String sql = "insert into users(userId, username, role, name, phoneNr, email) values(:userId,:username,:role,:name,:phoneNr,:email)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("userId", user.getUserId())
				.addValue("username", user.getUsername())
				.addValue("role", user.getRole())
				.addValue("name", user.getName())
				.addValue("phoneNr", user.getPhoneNr())
				.addValue("email", user.getEmail());
		template.update(sql,param,holder);
	}

	@Override
	public void updateUser(User user) {
		final String sql = "update users set userId=:userId, username=:username, role=:role, name=:name, phoneNr=:phoneNr, email=:email where userId=:userId";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("userId", user.getUserId())
				.addValue("username", user.getUsername())
				.addValue("role", user.getRole())
				.addValue("name", user.getName())
				.addValue("phoneNr", user.getPhoneNr())
				.addValue("email", user.getEmail());
		template.update(sql,param,holder);
	}

	@Override
	public void executeUpdateUser(User user) {
		final String sql = "update users set userId=:userId, username=:username, role=:role, name=:name, phoneNr=:phoneNr, email=:email where userId=:userId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("userId", user.getUserId());
		map.put("username", user.getUsername());
		map.put("role", user.getRole());
		map.put("name", user.getName());
		map.put("phoneNr", user.getPhoneNr());
		map.put("email", user.getEmail());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		     }
		});
		
	}

	@Override
	public void deleteUser(User user) {
		final String sql = "delete from users where userId=:userId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("userId", user.getUserId());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});
		
	}

}
