<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<section id="member">
<div>
<div class="row"><div class="col-md-5"> <div class="card-body">
<form action="./send_information_view.jsp" method="post" id="signupForm">
<fieldset>
<div class="form-group row">
<label for="name" class="ml-sm-4 col-form-label">이름</label>
<div class="ml-sm-4">
<input type="text" name="name" id="name">
</div>
</div>
<div class="form-group row">
<label for="age"> 나이 </label>
<div>
<input type="text" name="age" id="age">
</div>
</div>

<div>
<button type="submit" id="register">전송</button>
<button type="reset" id="register">취소</button>
</div>
</fieldset>
</form>

</div> </div>
</div>
</div>
</section>
</body>
</html>