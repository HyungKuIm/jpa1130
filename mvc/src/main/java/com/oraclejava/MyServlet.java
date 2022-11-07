package com.oraclejava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my")
public class MyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "임형구");
		map.put("addr", "경기도 고양시");
		
		List<String> hobbies = new ArrayList<>();
		hobbies.add("한국 영화 감상");
		hobbies.add("음악 감상");
		hobbies.add("자연 감상");
		hobbies.add("미국 영화 감상");
		hobbies.add("일본 영화 감상");
		
		map.put("hobby", hobbies);
		map.put("insta", "damansa72");
		map.put("phonePrice", 297000);
		
		req.setAttribute("info", map);
		
		req.getRequestDispatcher("myinfo.jsp").forward(req, resp);
	}

	
}






