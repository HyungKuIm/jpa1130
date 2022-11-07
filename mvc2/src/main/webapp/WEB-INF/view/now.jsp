<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1 {
		font-size: 70pt;
		color: #aaa;
		margin: -15px 0px;
	}
</style>
</head>
<body>
	<h1><fmt:formatDate value="${currentDate}" pattern="yyyy-MM-dd a hh:mm"/></h1>
	<p>현재 시간입니다.</p>
</body>
</html>