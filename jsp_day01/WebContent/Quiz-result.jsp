<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz-result.jsp</title>
<style>
table {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 5px 10px;
	border: 1px solid grey;
	text-align: center;
}
</style>
</head>
<body>
	<!-- 
	quiz-form.jsp에서 넘어온
	파라미터를 <table>태그를 이용하여 각각 출력
 -->

	<h1>네이버 로그인 ID, PW</h1>
	<hr>

	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw2 = request.getParameter("pw2");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth-y") + "-" + request.getParameter("birth-M") + "-"
				+ request.getParameter("birth-d");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String phoneNum = request.getParameter("phoneNum");
	%>
	<table>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>비밀번호확인</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>성별</th>
			<th>이메일</th>
			<th>전화번호</th>
		</tr>
		<tr>
			<td><%=id%></td>
			<td><%=pw %></td>
			<td><%=pw2 %></td>
			<td><%=name %></td>
			<td><%=birth %></td>
			<td><%=gender %></td>
			<td><%=email %></td>
			<td><%=phoneNum %></td>
		</tr>
	</table>
</body>
</html>