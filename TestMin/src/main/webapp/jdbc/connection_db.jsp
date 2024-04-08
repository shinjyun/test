<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Boolean bool = (Boolean)request.getSession().getAttribute("bool");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스 연결 확인</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
<div>
<%
if(bool == true) {	
%>
데이터베이스와 연결되었습니다.
<%
} else {
%>
데이터베이스 연결에 실패하였습니다.
<%
}
%>

</div>

</body>
</html>