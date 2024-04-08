<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<section id="member">
		<div>
			<h4>회원 가입</h4>
		</div>
		<div>
			<form action="./JoinMembership" method="post" id="signupForm">
				<fieldset>
					<label for="name">이름</label>
					<div>
						<input type="text" name="name" id="name">
					</div>
					<div>
						<label for="password">아이디</label>
					</div>
					<div>
						<input type="text" name="id" id="id">
					</div>
					<div>
						<label for="password">비밀번호</label>
					</div>
					<div>
						<input type="password" name="password" id="password">
					</div>
					<div>
						<label for="pwdre">비번확인</label>
					</div>
					<div>
						<input type="password" name="pwdre" id="pwdre">
					</div>
					<div>
						<label for="gender">성별</label>
					</div>
					<div>
						<input type="radio" name="gender" id="gender" value="m">남 <input
							type="radio" name="gender" id="gender" value="f">여
					</div>
					<div>
						<label for="hobby">취미</label>
					</div>
					<div>
						<input type="checkbox" value="축구" name="hobby" id="hobby" checked>축구
						<input type="checkbox" value="야구" name="hobby" id="hobby">야구
						<input type="checkbox" value="농구" name="hobby" id="hobby">농구
					</div>
					<div>
						<button type="submit" id="register">등록</button>
						<button type="reset" id="cancel">취소</button>
					</div>
				</fieldset>
			</form>
		</div>
	</section>
</body>
</html>