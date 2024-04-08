<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키 이름 : <%=request.getAttribute("name") %><br>
쿠키 값 : <%=request.getAttribute("value") %><br>

</body>
</html>