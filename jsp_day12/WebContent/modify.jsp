<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO" />

<section>
<h3>수정할 품목을 선택하세요</h3>
	<table>
		<thead>
			<tr>
				<th>카테고리</th>
				<th>식당이름</th>
				<th>주소</th>
				<th>전화번호</th>
				<th>주차여부</th>
				<th>등록날짜</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${dao.selectList() }">
			<tr align="center" onClick="location.href='modify-form.jsp?idx=${dto.idx }'">
				<td>${dto.category }</td>
				<td>${dto.storename }</td>
				<td>${dto.address }</td>
				<td>${dto.storenumber }</td>
				<td>${dto.parking }</td>
				<td>${dto.joindate }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</section>

</body>
</html>