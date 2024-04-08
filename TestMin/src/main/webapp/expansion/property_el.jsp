<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로퍼티 호출</title>
</head>
<body>
<div>
부서 번호 : ${deptno}
</div>
<div>
부서 이름 : ${dname}
</div>
<div>
부서 지역 : <%=request.getAttribute("loc ") %>
</div>

</body>
</html>