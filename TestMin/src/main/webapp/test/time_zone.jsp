<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시간 패턴</title>
</head>
<body>
<c:set var="now" value="<%=new java.util.Date() %>"/>
<div>
<fmt:timeZone value="NewYork">
[뉴욕 현재 시간] <fmt:formatDate value="${now}" type="time" pattern="(a)hh:mm:ss"/>
</fmt:timeZone>
</div>
</body>
</html>