<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<%
	if(request.getMethod().equals("GET")){
		int idx = Integer.parseInt(request.getParameter("idx"));
		pageContext.setAttribute("pb", hd.getItem(idx));
	%>
	<form method="POST">
			<p><input type="text" name="name" value="${pb.name }"required autofocus></p>
			<p>
				<input type="text" name="fNumber" value="${pb.fNumber }" required >-
				<input type="text" name="sNumber" value="${pb.sNumber }" required >-
				<input type="text" name="thNumber" value="${pb.thNumber }" required >
			</p>
			<input type="hidden" name="idx" value=${pb.idx }>
			<p><input type="submit" value="수정">	
		</form>
	<%} %>
	<%if(request.getMethod().equals("POST")){%>
		<jsp:useBean id="user" class="phoneBook.PhoneBook" />
		<jsp:setProperty property="*" name="user"/>
		<h3>${handler.modify(user) >= 0  ? '수정완료' : '수정실패' }</h3>
		<a href="${cpath }/list.jsp"><button>목록으로</button></a>
	<%} %>
</section>
</main>
</body>
</html>