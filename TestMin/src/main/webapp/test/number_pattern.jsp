<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자 패턴</title>
</head>
<body>
<div>
통화 표시 : <fmt:formatNumber value="50000" type="currency"/>
</div>
<div>
퍼센트 표시 : <fmt:formatNumber value="0.15" type="percent"/>
</div>
<div>
세 자릿수 표시 : <fmt:formatNumber value="500567300" pattern="###,###,###"/>
</div>
</body>
</html>