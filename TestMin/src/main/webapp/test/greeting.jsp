<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인사말</title>
</head>
<body>
	<div>
		<fmt:bundle basename="./hello.greeting_kr">
			<fmt:message key="name" />
			<fmt:message key="say" />

			<fmt:message key="introduce"><fmt:param value="홍길동" /></fmt:message>
		</fmt:bundle>
		<div>
			<fmt:setBundle var="intro" basename="./hello.greeting_en" />
			<fmt:message bundle="${intro}" key="name" />
			<fmt:message bundle="${intro}" key="say" />
		</div>
	</div>
</body>
</html>