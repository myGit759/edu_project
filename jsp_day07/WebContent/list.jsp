<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<ol>
	<%	
		for(Member member : memberHandler.getList()){ 
			pageContext.setAttribute("member", member);	// 현재 페이지에서만 참조하면 되니까 pageContext
			%>
			<li>
				${member.userid } / 
				${member.userpw } / 
				${member.username } / 
				${member.age } / 
				${member.birth }
			</li>
		<%} %>
	</ol>
</section>
</main>
</body>
</html>