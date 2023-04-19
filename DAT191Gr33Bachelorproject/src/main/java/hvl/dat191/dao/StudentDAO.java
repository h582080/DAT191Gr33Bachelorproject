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

import hvl.dat191.daointerface.StudentDAOInterface;
import hvl.dat191.mapper.StudentRowMapper;
import hvl.dat191.model.Student;

@Repository
public class StudentDAO implements StudentDAOInterface {
	
	public StudentDAO (NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	NamedParameterJdbcTemplate template;

	@Override
	public List<Student> findAllStudent() {
		return template.query ("select * from student", new StudentRowMapper());
	}

	@Override
	public void insertStudent(Student student) {
		final String sql = "insert into student(studentId, name, phoneNr, email) values(:studentId,:name,:phoneNr,:email)";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("studentId", student.getStudentId())
				.addValue("name", student.getName())
				.addValue("phoneNr", student.getPhoneNr())
				.addValue("email", student.getEmail());
		template.update(sql,param,holder);
		
	}

	@Override
	public void updateStudent(Student student) {
		final String sql ="update student set studentId=:studentId, name=:name, phoneNr=:phoneNr, email=:email where studentId=:studentId";
		
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("studentId", student.getStudentId())
				.addValue("name", student.getName())
				.addValue("phoneNr", student.getPhoneNr())
				.addValue("email", student.getEmail());
		template.update(sql,param,holder);
		
	}

	@Override
	public void executeUpdateStudent(Student student) {
		final String sql ="update student set studentId=:studentId, name=:name, phoneNr=:phoneNr, email=:email where studentId=:studentId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("studentId", student.getStudentId());
		map.put("name", student.getName());
		map.put("phoneNr", student.getPhoneNr());
		map.put("email", student.getEmail());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		     }
		});
		
	}

	@Override
	public void deleteStudent(Student student) {
		final String sql = "delete from student where studentId=:studentId";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("studentId", student.getStudentId());
		
		template.execute(sql,map,new PreparedStatementCallback<Object>() {  
		    @Override  
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});
	}

}
