<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포워드 액션</title>
</head>
<body>
<jsp:forward page="${param.page}">
<jsp:param value="010-9760-4065" name="tel"/>
</jsp:forward>
</body>
</html>