<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 제거</title>
<script type="text/javascript">
location.href = "./session_check.jsp";
</script>
</head>
<body>
<% session.removeAttribute("name"); %>
</body>
</html>