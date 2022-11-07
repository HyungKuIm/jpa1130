package com.oraclejava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBConnectionTest")
public class DBConnectionTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		try {
			// 오라클 드라이버를 Load 한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 데이터 베이스에 접속을 한다.
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
			
			// Statement object를 생성한다.
			stmt = con.createStatement();
			
			// ResultSet을 얻기위해 SQL query를 실행한다.
			rs = stmt.executeQuery("select "
					+ "employee_id, first_name, last_name,"
					+ "salary, hire_date "
					+ "from employees");
			
			// 결과 출력
			out.println("<html><head><title>Phonebook</title></head>");
			out.println("<body>");
			out.println("<table border=\"1\">");
			out.println("<tr><th>사번</th><th>이름</th><th>성</th>"
					+ "<th>급여</th><th>입사일</th></tr>");
			while(rs.next()) {
			
				out.println("<tr><td>" + rs.getInt("employee_id") + "</td><td>" + 
					rs.getString("first_name") + "</td><td>" +
					rs.getString("last_name") + "</td><td>" +
					rs.getDouble("salary") + "</td><td>" +
					rs.getDate("hire_date") + "</td></tr>");
			}
			out.println("</table>");
			out.println("</body></html>");
		} catch (ClassNotFoundException e) {
			out.println("드라이버를 로드할 수 없습니다: " + e.getMessage());
		} catch (SQLException e) {
			out.println("SQL 에러:" + e.getMessage());
		} finally {
			// 언제나 데이터 베이스 연결을 종료한다.
			try {
				if (con != null) con.close();
			} catch (SQLException ignored) { }
		}
	}

	
}








