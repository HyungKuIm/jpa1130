package com.oraclejava.day7;

import java.sql.*;

public class GetDepartmentList {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select" 
					+ " d.department_id, "
					+ " d.department_name, "
					+ " d.manager_id, "
					+ " d.location_id, "
					+ " e.first_name, "
					+ " e.last_name "
					+ " from departments d left outer join employees e"
					+ " on d.manager_id = e.employee_id");
			System.out.printf("%-10s%-15s%-10s%-10s%-10s\n", 
					"부서id", "부서명", "관리자id", "관리자 이름", "위치id");
			while(rs.next()) {
				System.out.printf("%-5d%-20s%-10d%-10s%10d\n",
						rs.getInt("department_id"),
						rs.getString("department_name"),
						rs.getInt("manager_id"),
						rs.getString("last_name"),
						rs.getInt("location_id"));
			}
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버를 로드할 수 없습니다:" + e.getMessage());
		}catch(SQLException e) {
			System.out.println("sql 에러:" + e.getMessage());
		}finally {
			try {
				if(con != null)
					con.close();
			}catch(SQLException ignored) {
				
			}
		}
		
	}

}
