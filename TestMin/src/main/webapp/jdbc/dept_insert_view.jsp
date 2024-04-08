<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int deptno = Integer.parseInt(request.getParameter("deptno"));
    out.println("<script type='text/javascript'>");
    out.println("alert('입력하신 " + deptno + "번 부서 번호를 데이터베이스에서 확인하세요.')");
    out.println("history.back()");
    out.println("</script>");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 입력</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
</body>
</html>