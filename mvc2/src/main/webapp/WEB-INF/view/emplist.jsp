<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 목록</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>성</th>
		</tr>
		<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.first_name}</td>
			<td>${emp.last_name}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>