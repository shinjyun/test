<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = (String)session.getAttribute("id");
    Cookie[] cookies = request.getCookies();
    if(cookies != null) {
    	for(Cookie cookie : cookies) {
    		if(cookie.getName().equals("id")) {
    			id = cookie.getValue();
    			session.setAttribute("id", id);
    		}
    	}
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선호도 조사</title>
</head>
<body>
<form action="./preference_check.jsp" method="post">
<fieldset>
<div><%=id %>님 환영합니다.</div>
<label for="season">가장 좋아하는 계절은?</label>
<input type="radio" name="season" id="season" value="봄">봄
<input type="radio" name="season" id="season" value="여름">여름
<input type="radio" name="season" id="season" value="가을">가을
<input type="radio" name="season" id="season" value="겨울">겨울

<div> <button type="submit">전송</button> </div>
</fieldset>
</form>
</body>
</html>