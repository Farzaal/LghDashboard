package utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class DAO {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@SuppressWarnings("rawtypes")
	public List<HashMap> selectData(String sql,final String[] columns){
		
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<HashMap>>() {

			@SuppressWarnings("unchecked")
			public List<HashMap> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<HashMap> vec = new ArrayList<HashMap>();
				 int i = 1;
				 
				 while (rs.next()) {
		                HashMap hashRow = new HashMap();
		                for (; i < columns.length; i++) {
		                    // System.out.println(columns[i] + " = " + rs.getString(columns[i]));
		                    hashRow.put(columns[i], rs.getString(columns[i]));
		                }
		                i = 1;
		                vec.add(hashRow);
		            }
				return vec;
			}
		});
	}
}
