<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON 객체 변환</title>
</head>
<body>
<div>
<script type="text/javascript">
data = '{"name": "홍길동", "age": 33, "city": "서울"}';

cnv = JSON.parse(data);
document.getElementById("access").innerHTML += cnv.name + ", " + cnv.age + ", " + cnv.city;
</script>
</div>
</body>
</html>