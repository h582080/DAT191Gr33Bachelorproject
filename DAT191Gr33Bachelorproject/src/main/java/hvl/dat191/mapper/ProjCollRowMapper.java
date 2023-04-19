package hvl.dat191.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import hvl.dat191.model.Projectcollection;

public class ProjCollRowMapper implements RowMapper<Projectcollection> {

	@Override
	public Projectcollection mapRow(ResultSet rs, int rowNum) throws SQLException {
		Projectcollection pcol = new Projectcollection(
				//String eller int?
				rs.getString("collectionId"),
				rs.getInt("template"),
				rs.getString("collectionTittel"),
				rs.getString("semester"));
		return pcol;
	}

}
