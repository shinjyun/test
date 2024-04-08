<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="../js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="../js/jquery.cookie.js" type="text/javascript"></script>
<script src="../js/cookie_login.js" type="text/javascript"></script>
</head>
<body>
	<section id="login">
		<div>
			<div class="row">
				<div class="card-header">
					<h4>ID 로그인</h4>
				</div>
				<div class="card-body">
					<form action="../LoginCheck" method="post" id="signupForm">
						<fieldset>
							<div class="form-group">
								<label for="id">아이디</label> <input type="text" name="id" id="id">
							</div>
							<div class="form-group">
								<label for="password">비밀번호</label> <input type="password"
									name="password" id="password">
							</div>
							<div class="form-check p-3 my-2">
								<input type="checkbox" name="save" id="save"> <label
									for="save">로그인 상태 유지</label>
							</div>
							<button type="submit" id="register">로그인</button>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>