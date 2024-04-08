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
<div>
<div class="row"> <div> <div class="card-body">
<form action="./EncodingFilter" method="post" id="signuForm">
<fieldset>
<div class="form-group row">
<label for="name">이름</label>
<div>
<input type="text" name="name" id="name">
</div>
</div>
<div class="form-group row">
<label for="age">나이</label>
<div>
<input type="text" name="age" id="age">
</div>
</div>
<div class="form-group">
<button type="submit" id="register">전송</button>
<button type="reset" id="register">취소</button>
</div>
</fieldset>
</form>
</div> </div> </div>
</div>
</section>
</body>
</html>