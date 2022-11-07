<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" 
	href="${pageContext.request.contextPath}/css/board.css">
</head>
<body>
	<h1>게시판입니다...</h1>
	<form:form modelAttribute="articleForm" 
		action="${pageContext.request.contextPath}/board/write_ok">
		글쓴이: <form:input path="name"/><br>
		글내용: <form:textarea path="content" rows="5" cols="25"/> <br>
		<input type="submit" value="쓰기">
	</form:form>
	<hr>
	<c:forEach var="article" items="${articleList}">
		글쓴이: ${article.name} <br>
		글내용: <pre>${article.content}</pre>
		<form:form modelAttribute="articleForm"
			action="${pageContext.request.contextPath}/board/delete_ok">
				<input type="hidden" name="id" value="${article.id}">
				<input type="submit" value="게시글 삭제">
		</form:form>
		
		<br>
		<c:forEach var="comment" items="${article.commentList}">
			댓글쓴 사람: ${comment.name} <br>
			댓글 내용: ${comment.content} <br>
		</c:forEach>
		<form:form modelAttribute="commentForm"
			action="${pageContext.request.contextPath}/board/comment_ok">
			<input type="hidden" name="articleId" value="${article.id}">
			이름: <form:input path="name" /> <br>
			댓글: <form:textarea path="content"/> <br>
			<input type="submit" value="댓글쓰기">
		</form:form>
		<hr>
	</c:forEach>
	
	
</body>
</html>