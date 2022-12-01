<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<section>
	<form method="POST" action="login-action.jsp">
		<p><input type="text"name="userid" placeholder="아이디" required autofocus></p>
		<p><input type="password" name="userpw" placeholder="패스워드" required></p>
		<p><input type="submit" value="로그인"></p>
	</form>
</section>

</main>
</body>
</html>