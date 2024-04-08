<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		쿠키명 :
		<%=request.getSession().getAttribute("name")%>
	</div>
	<div>
		쿠키값 :
		<%=request.getSession().getAttribute("value")%>
	</div>
</body>
</html>