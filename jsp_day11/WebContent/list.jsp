<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<jsp:useBean id="dao" class="product.ProductDAO" scope="page"/>

<section>
<h3>상품 목록</h3>
<table>
	<thead>
		<tr>
			<th>IDX</th>
			<th>NAME</th>
			<th>PRICE</th>
			<th>IMGPATH</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach var="product" items="${dao.selectList() }">
		<tr>
			<td>${product.idx }</td>
			<td>${product.name }</td>
			<td>${product.price }</td>
			<td>${product.imgPath }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</section>
</main>

</body>
</html>