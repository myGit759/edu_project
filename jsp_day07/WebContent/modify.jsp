<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<form action="modify-action.jsp" method="POST">
	<input type="hidden" name="userid" value="${login.userid }">
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<td>userid</td>
			<td>${login.userid }</td>
		</tr>
		<tr>
			<td>userpw</td>
			<td><input type="password" name="userpw"></td>
		</tr>
		<tr>
			<td>username</td>
			<td><input type="text" name="username" value="${login.username }"></td>
		</tr>
		<tr>
			<td>age</td>
			<td><input type="number" name="age" value="${login.age}"></td>
		</tr>
		<tr>
			<td>birth</td>
			<td><input type="text" name="birth" value="${login.birth}"></td>
		</tr>
	</table>
	<p><input type="submit" value="수정"></p>
	</form>
</section>

</main>
</body>
</html>