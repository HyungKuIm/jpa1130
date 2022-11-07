<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원추가</title>
</head>
<body>
	<form method="post" action="./empadd_ok">
		사번: <input type="text" name="id" /> <br>
		이름: <input type="text" name="firstName" /> <br>
		성: <input type="text" name="lastName" /> <br>
		이메일: <input type="text" name="email" /> <br>
		<input type="submit" value="추가">
	</form>
</body>
</html>