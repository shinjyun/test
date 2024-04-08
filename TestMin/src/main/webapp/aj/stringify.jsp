<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문자열 객체 반환</title>
</head>
<body>
<div>
<script type="text/javascript">
data = {
		"name": "홍길동";
		"age" : 33,
		city : "서울"
};

cnv = JSON.stringify(data);
document.getElementById("access").innerHTML = cnv;
</script>
</div>
</body>
</html>