<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    
    int age = Integer.parseInt(request.getParameter("age"));
    
    if(name != "" & age != 0) {
    	application.setAttribute("name", name);
    	application.setAttribute("age", age);
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 확인</title>
<link rel="stylesheet" type="text/css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>

</head>
<body>
<div>
<%=name %>님 반갑습니다.
</div>
<div>
<%=name %>님의 나이는 <%=age %>세 입니다.
</div>
</body>
</html>