<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보</title>
</head>
<body>

	<div>
		세션 유지 여부 :
		<%=session.isNew()%>
	</div>

	<div>
		세션 생성 시간 :
		<%=session.getCreationTime()%>
	</div>

	<div>
		최종 접속 시간 :
		<%=session.getLastAccessedTime()%>
	</div>

	<div>
		세션 ID :
		<%=session.getId()%>
	</div>

</body>
</html>