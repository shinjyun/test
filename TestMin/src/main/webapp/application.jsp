<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>애플리케이션 정보</title>
<link rel="stylesheet" type="text/css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>

</head>
<body>
<div>
JSP 버전 : <%= application.getMajorVersion()%>.<%=application.getMajorVersion() %>
</div>

<div>
JSP 컨테이너 정보 : <%=application.getServerInfo() %>
</div>

<div>
실제 파일의 시스템 경로 : <%=application.getRealPath("/") %>
</div>
</body>
</html>