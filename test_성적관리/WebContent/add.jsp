<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add.jsp</title>
<style>
	table{
		border-collapse: collapse;
	}
	td, th {
		border: 1px solid black;
		padding: 5px 10px;
	}
	a {
		text-decoration: none;
		color: inherit;
	}
</style>
</head>
<body>

<h1>학생 성적 관리 프로그램</h1>
<hr>



<nav>
	<ul>
		<li><a href="index.jsp">목록</a></li>
		<li><a href="add.jsp">추가</a></li>
		<li><a href="delete.jsp">삭제</a></li>
	</ul>
</nav>

<form method="POST" action="add-result.jsp">
	<p><input type="text" name="name" placeholder="이름" required autofocus></p>
	<p><input type="number" name="kor" placeholder="국어점수" required></p>
	<p><input type="number" name="eng" placeholder="영어점수" required></p>
	<p><input type="number" name="mat" placeholder="수학점수" required></p>
	<p><input type="submit" value="등록">
</form>
</body>
</html>