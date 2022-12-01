<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-form.jsp</title>
</head>
<body>

<h1>Up Down Game</h1>
<hr>

<h3>1 ~ 100 사이 숫자를 입력하세요</h3>
<form action="ex02-action.jsp">
	<p><input type="number" name="user" required autofocus></p>
	<input type="submit" value="입력">
</form>

</body>
</html>