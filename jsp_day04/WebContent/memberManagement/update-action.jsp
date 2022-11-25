<%@page import="memberManagement.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%
	String userid = request.getParameter("userid");
	Member mem = handler.find(userid);
	
%>
<section>
	<h3>회원 수정</h3>
	<form Method="POST" action="update-result.jsp">
		<p><%=userid %><input type="hidden" name="userid" value="<%=mem.getUserid() %>"></p>
		<p><input type="password" name="userpw" value="<%=mem.getUserpw() %>" required></p>
		<p><input type="text" name="username" value="<%=mem.getUsername() %>" required></p>
		<p><input type="number" name="age" value="<%=mem.getAge() %>" required></p>
		<p><input type="submit" value="수정완료"></p>
	</form>
</section>


</body>
</html>