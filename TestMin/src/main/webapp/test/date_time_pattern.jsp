<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜와 시간 패턴</title>
</head>
<body>
<c:set var="now" value="<%=new java.util.Date() %>"/>
<div>
[현재 날짜] <fmt:formatDate value="${now}" type="date" pattern="yyyy/MM/dd(E)"/>
<div>
</div>
[현재 시간] <fmt:formatDate value="${now}" type="time" pattern="(a)hh:mm:ss"/>
</div>
</body>
</html>