<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>컬렉션 정보</title>
</head>
<body>
	<c:forEach var="dish" items="${menu }" varStatus="condition">
		<div>
			<ul>
				<li>${dish } [아이템 : ${condition.current }, 아이템의 인덱스 :
					${condition.index }, 아이템의 반복 순서 : ${condition.count }]</li>
			</ul>
		</div>
	</c:forEach>
</body>
</html>