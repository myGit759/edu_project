<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<table>
		<thead>
			<tr>
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
				<td>${pb.name }</td>
				<td>${pb.fNumber }-${pb.sNumber }-${pb.thNumber }</td>
				<td><a href="${cpath }/modify.jsp?idx=${pb.idx}"><button>수정</button></a></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</section>

</main>
</body>
</html>