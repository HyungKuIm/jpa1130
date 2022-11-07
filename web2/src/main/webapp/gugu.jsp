<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="ad.jsp"/>
<table border="1">
<%
	int sum;
	
	for (int i=1; i<=9; i++) {  // 각 단의 세로값
		out.println("<tr>");
		for (int j=1; j<=9; j++) { // 1 ~ 9단
			sum = i * j;
			out.println("<td>" + j + "*" + i + " = " + sum + "</td>");
		}
		out.println("</tr>");
	}
%>
</table>
</body>
</html>




