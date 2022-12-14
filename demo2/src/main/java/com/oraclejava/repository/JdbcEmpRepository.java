package com.oraclejava.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oraclejava.domain.Employee;

@Repository
public class JdbcEmpRepository implements EmpRepository{

	private JdbcTemplate jdbcTemplate;

	// 반드시 생성자 '하나'만 만들어야 된다!
	public JdbcEmpRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Iterable<Employee> findAll() {
		String sql = "select * from employees";
		return jdbcTemplate.query(sql, this::mapRowToEmp);
	}
	
	private Employee mapRowToEmp(ResultSet rs, int rowNum)
		throws SQLException {
		Employee emp = new Employee();
		emp.setFirstName(rs.getString("first_name"));
		emp.setLastName(rs.getString("last_name"));
		return emp;
	}

	

}
