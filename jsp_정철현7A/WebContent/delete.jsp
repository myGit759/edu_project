<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<section>
	<%
		if(request.getMethod().equals("GET")){
	%>
	<form method="POST">
		<table>
		<thead>
			<tr>
				<th>삭제</th>
				<th>이름</th>
				<th>전화번호</th>
			</tr>
		</thead>

		<tbody>
			<%
				for (PhoneBook pb : hd.getList()) {
					pageContext.setAttribute("pb", pb);
			%>
			<tr>
				<td><input type="checkbox" name="idx" value="${pb.idx }"></td>
				<td>${pb.name }</td>
				<td>${pb.fNumber }-${pb.sNumber }-${pb.thNumber }</td>
			</tr>
			<%} %>
		</tbody>
	</table>
	<p><input type="submit" value="삭제"></p>
	</form>
	<%} %>
	
	
	<%
		if(request.getMethod().equals("POST")){

		String[] values = request.getParameterValues("idx");
		pageContext.setAttribute("values", values);
	%>
<!-- 	EL Tag안에 넣기위해서는 꼭 attribute를 해줘야한다! -->
		${handler.delete(values) } 
		
	<%response.sendRedirect(request.getContextPath()+"/list.jsp");	} %>
	
</section>
</main>
</body>
</html>