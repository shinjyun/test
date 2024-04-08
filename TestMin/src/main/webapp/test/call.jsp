<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${list[1]}

<%
List list = (List) request.getAttribute("list");
for(Object menu : list) {
	pageContext.setAttribute("menu", menu);

%>

${menu}

<% } %>
</body>
</html>