package com.oraclejava.emp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> selectEmpList() {
		String sql = "select * from employees";
		return jdbcTemplate.queryForList(sql);
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertEmp(int id, String firstName, 
			String lastName, String email) {
		String sql = "insert into employees(employee_id, first_name, "
				+ "last_name, email, hire_date, job_id) "
				+ "values(?,?,?,?,sysdate,'IT_PROG')";
		jdbcTemplate.update(sql, id, firstName, lastName, email);
		
	}
	
	

}







