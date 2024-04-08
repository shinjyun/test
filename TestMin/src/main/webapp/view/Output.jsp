<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>
	<div>
	이름 : <%= request.getAttribute("name") %> <br>
	아이디 : <%= request.getAttribute("id") %> <br>
	비밀번호 : <%= request.getAttribute("password") %> <br>
	성별 : <%= request.getAttribute("gender") %> <br>
	취미 : <%= request.getAttribute("hobby") %> <br>
	나이 : <%= request.getAttribute("age") %>살 <br>
	생년월일 : <%= request.getAttribute("birth") %>
	
	</div>
</body>
</html>