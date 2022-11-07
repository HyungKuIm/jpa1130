<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%!
	public void jspInit() {
		System.out.println("축 jsp 탄생!");
	}

	public void jspDestroy() {
		System.out.println("축 jsp 사망!");
	}
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	안녕하세요 <br>
	<%
		// 자바 코드 시작!
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//out.println("오늘은 " + sdf.format(date) + "입니다.");
	%>
	오늘은 <%= sdf.format(date) %>입니다.
</body>
</html>






