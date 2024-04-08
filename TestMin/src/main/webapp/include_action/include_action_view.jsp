<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.net.URLDecoder" %>
    <% String namekr = request.getParameter("namekr"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
</head>
<body>
<div>이름 : ${param.name}</div>
<div>인코딩 이름 : ${param.namekr}</div>
<div>인코딩 이름 : <%=URLDecoder.decode(namekr, "UTF-8") %></div>
</body>
</html>