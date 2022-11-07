package com.oraclejava.springcore3;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		JdbcTemplate jdbcTemplate = 
				ctx.getBean(JdbcTemplate.class);
		
		// 208 사원 추가
		jdbcTemplate.execute(
			"insert into employees(employee_id,first_name,last_name,"
			+ " email, hire_date, job_id) values (209,"
			+ " '장훈', '서', 'janghun@jtbc.co.kr', sysdate, 'IT_PROG')");
		
		System.out.println("입력에 성공했습니다.");
		
		ctx.close();

	}

}
