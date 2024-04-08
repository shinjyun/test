<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>언어 변경</title>
</head>
<body>
현재 언어 확인 : <%= response.getLocale() %>
<fmt:setLocale value="en"/>
변경 언어 확인 : <%=response.getLocale() %>
</body>
</html>