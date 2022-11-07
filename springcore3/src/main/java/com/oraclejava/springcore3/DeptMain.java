package com.oraclejava.springcore3;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeptMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		JdbcTemplate jdbcTemplate = 
				ctx.getBean(JdbcTemplate.class);
		
		// 281번 부서, 부서명: 야구부 라는 부서를 추가
		String sql = "insert into departments(department_id,"
				+ " department_name) values (281,"
				+ " '야구부')";
		jdbcTemplate.execute(sql);
		
		ctx.close();
		

	}

}
