<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%-- <% if(request.getMethod().equals("GET")) {%> --%>
	<section>
		<form method="POST" action="join-1.jsp">
			<p>
				<input type="text" class="<%=request.getParameter("false") != null ? "false" : "" %>" 
				name="userid" placeholder="아이디" required autofocus>
				<span class="<%=request.getParameter("false") != null ? "duple" : "fst" %>">아이디중복</span>
			</p>
			<p><input type="password" name="userpw"  value="${user.userpw }" placeholder="패스워드" required></p>
			<p><input type="text" name="username"  value="${user.username }" placeholder="이름" required></p>
			<p><input type="number" name="age"  value="${user.age}" placeholder="나이" required></p>
			<p><input type="date" name="birth" value="${user.birth}"  required></p>
			<p><input type="submit" value="가입신청"></p>
		</form>
	</section>
<%-- <%} %> --%>

<%-- <%  --%>
<%-- 	if(request.getMethod().equals("POST")) {%> --%>
<%-- 		<jsp:useBean id="user" class="day07.Member" /> --%>
<%-- 		<jsp:setProperty property="*" name="user" /> --%>
<%-- 		<% --%>
<!-- // 		String url = memberHandler.insert(user) == 1 ? "list.jsp" : "join.jsp?false=duplicate"; -->
<!-- // 		request.setAttribute("user", user); -->
<!-- // 		request.getRequestDispatcher(url).forward(request, response); -->
<!-- // //		response.sendRedirect(cpath + url); -->
<%-- 	} %> --%>

</main>
</body>
</html>