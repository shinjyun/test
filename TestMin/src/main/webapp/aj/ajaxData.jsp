<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>접근 권한 체크</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
<div>
입력한 아이디는 ${param.id}이며
<c:choose>
<c:when test="${param.id=='admin'&& param.password=='1234'}">
접근 권한이 있습니다.
</c:when>
<c:otherwise>
접근 권한이 없습니다.
</c:otherwise>
</c:choose>
</div>
</body>
</html>