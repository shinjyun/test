<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 입력</title>
</head>
<body>
<section id="department">
<div> <h4>부서 정보 입력</h4> </div>
<form action="../DeptInsert" method="post" id="sign_dept">
<fieldset>
<div>
<label for="deptno">부서 번호</label>
<input type="text" name="deptno" id="deptno">
</div>
<div>
<label for="dname">부서 이름</label>
<input type="text" name="dname" id="dname">
</div>
<div>
<label for="loc">부서 지역</label>
<input type="text" name="loc" id="loc">
</div>
<div>
<button type="submit">부서 입력</button>
<button type="reset">입력 취소</button>
</div>
</fieldset>
</form>
</section>
</body>
</html>