package com.oraclejava.day7;

import java.sql.*;

public class DBConnectionTest {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 오라클 드라이버를 Load 한다
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. 데이터 베이스에 접속을 한다.
			con = 
				DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1522:xe","hr","hr");
			
			// 3. Statement object를 생성한다.
			stmt = con.createStatement();
			
			// ResultSet을 얻기위해 SQL query를 실행한다.
			rs = stmt.executeQuery("select"
					+ " employee_id, first_name, "
					+ " last_name, salary, hire_date"
					+ " from employees");
			
			// 결과 출력
			while (rs.next()) {
				System.out.println(
						rs.getInt("employee_id") + " " +
						rs.getString("first_name") + " " + 
						rs.getString("last_name") + " " + 
						rs.getDouble("salary") + " " +
						rs.getDate("hire_date"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 로드할 수 없었습니다:" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL 에러: " + e.getMessage());
		} finally {
			// 언제나 데이터 베이스 연결을 종료한다
			try {
				if (con != null) 
					con.close();
			} catch (SQLException ignored) {
				
			}
		}

	}

}
