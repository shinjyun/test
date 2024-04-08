<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 정보</title>
</head>
<body>
	<div>이름 : ${membershipDTO.name }</div>
	<div>
		성별 :
		<c:choose>
			<c:when test="${membershipDTO.gender=='m' }">남자</c:when>
			<c:otherwise>여자</c:otherwise>
		</c:choose>
	</div>
	<div>
		취미 : ${membershipDTO.hobby }
	</div>
</body>
</html>