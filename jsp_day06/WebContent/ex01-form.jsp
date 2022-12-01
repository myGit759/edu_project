<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01-form.jsp</title>
<style>
	section {
		display: flex;
		width: 200px;
	}
	form {
		margin: auto;
	}
</style>
</head>
<body>

<h1>가위 바위 보</h1>
<hr>

<section>
	<form action="ex01-action.jsp">
		<input type="hidden" name="user" value="2">
		<input type="submit" value="가위">
	</form>
	<form action="ex01-action.jsp">
		<input type="hidden" name="user" value="0">
		<input type="submit" value="바위">
	</form>
	<form action="ex01-action.jsp">
		<input type="hidden" name="user" value="1">
		<input type="submit" value="보">
	</form>
</section>

</body>
</html>