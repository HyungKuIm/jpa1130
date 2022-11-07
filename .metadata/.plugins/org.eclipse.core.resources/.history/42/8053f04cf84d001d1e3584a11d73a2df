package com.oraclejava;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	
	
	

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("HelloServlet이 시작되었습니다.");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		resp.getWriter().println("Hello World! 안녕!!<br>감사!!");
	}

	@Override
	public void destroy() {
		super.destroy();
		// 서블릿에 죽기 직전에 호출됨...
		// 많이 사용안됨!
		System.out.println("HelloServlet이 종료되었습니다.");
	}
	
	

	
}
