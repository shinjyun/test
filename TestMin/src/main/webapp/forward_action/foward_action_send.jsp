<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 전송</title>
</head>
<body>
<section id="member">
<form action="./forward_action.jsp" method="post" id="signupForm">
<fieldset>
<input type="hidden" name="page" value="./forward_action_view.jsp">

<div>
<label for="name">이름</label>
</div>
<div>
<label for="id">아이디</label>
</div>
<div>
<input type="text" name="name" id="name">
</div>
<div>
<input type="text" name="id" id="id">
</div>
<div>
<button type="submit">전송</button>
<button type="reset">취소</button>
</div>
</fieldset>
</form>
</section>
</body>
</html>