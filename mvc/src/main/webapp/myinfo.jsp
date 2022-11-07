<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자기 소개</title>
</head>
<body>
	<p>이름: ${info.name }</p>
	<p>주소: ${info.addr }</p>
	
	<p>취미:
		<ul>
			<c:forEach var="hobby" items="${info.hobby}">
				<li>${hobby}</li>
			</c:forEach>
		</ul>
	</p>
	
	<p>인스타그램: ${info.insta }</p>
	<c:if test="${info.phonePrice >= 1000000}">
		<p>당신은 부자</p>
		<img src="https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/201904/27/63a33614-5773-45fe-a5fc-3b393ca2f387.jpg" />
	</c:if>
	<c:if test="${info.phonePrice >= 500000 and info.phonePrice < 1000000 }">
		<p>당신은 평민</p>
		<img src="https://photo.jtbc.co.kr/news/2016/04/25/20160425150508034.jpg" />
	</c:if>
	<c:if test="${info.phonePrice >= 300000 and info.phonePrice < 500000}">
		<p>당신은 서민</p>
		<img src="https://thumb.mt.co.kr/06/2020/09/2020092310504897128_1.jpg/dims/optimize/" />
	</c:if>
	<c:if test="${info.phonePrice < 300000 }">
		<p>당신은 거지</p>
		<img src="https://post-phinf.pstatic.net/MjAxOTA3MDlfMjMz/MDAxNTYyNjU4OTE5MjY2.AGWnX1OBrQPK3ClgVxm9YtzGztMP8qgDkMIFX1pQxy4g.Zx1mkoZZsntj4WsyPaZUO8NNjVrfpMMqH7QZNEYhJOAg.JPEG/500_2019_07_09_500_505737_1562637525.jpg?type=w1200" />
	</c:if>
</body>
</html>




