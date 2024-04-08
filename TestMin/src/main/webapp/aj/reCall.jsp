<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
// DOM 구축되기 전에 실행할 수 있도록 함
window.onload = function() {
	// 생성자 함수로 xhr 객체 생성
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4) {
			if (xhr.status >= 100 & xhr.status < 600) {
				document.getElementById('call').innerHTML = xhr.response;
			}
		}
	}
	xhr.open('get', './re.jsp');
	xhr.send();
}
</script>
<div id="call"></div>
</body>
</html>