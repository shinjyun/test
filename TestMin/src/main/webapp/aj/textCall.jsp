<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>텍스트 인서트</title>
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap.min_4.5.0.css">
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		$('#register').click(function() {
			$.ajax({
				url : "../data/data.txt",
				type : "GET",
				success : function(result) {
					$('#message').html(result);

				}
			});
			return false;
		});
	});
</script>
</head>
<body>
	<button>데이터 가져오기</button>
	<div id="message"></div>
</body>
</html>