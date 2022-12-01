<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<jsp:useBean id="user" class="day07.Member" />
<jsp:setProperty property="*" name="user"/>

<section>
	<% int row = memberHandler.modify(user);
		pageContext.setAttribute("row", row);
	if(row >=0){
		session.invalidate();
	}
	%>
	<h3>${ row >= 0? '수정 성공' : '수정 실패' }</h3>
	<a href="${cpath}"><button>다시 로그인 하기</button></a>
</section>

</main>
</body>
</html>