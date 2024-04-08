<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 다운로드</title>
</head>
<body>
	<div>파일이 업로드되었습니다. 다운로드 페이지입니다.</div>
	<div>이름 : ${name}</div>
	<div>제목 : ${subject}</div>
	<div>
		파일 다운로드 : <a href='./FileDownload?file_name=${file_name}'> ${origfilename} </a>
	</div>
</body>
</html>