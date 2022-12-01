<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
		<jsp:useBean id="user" class="day07.Member" />
		<jsp:setProperty property="*" name="user" />
		<%
		String url = memberHandler.insert(user) == 1 ? "list.jsp" : "join.jsp?false=duplicate";
		request.setAttribute("user", user);
		request.getRequestDispatcher(url).forward(request, response);
		%>
		
</body>
</html>