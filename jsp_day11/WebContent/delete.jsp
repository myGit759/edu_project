<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao" class="product.ProductDAO" />
<style>
	tbody > tr:hover {
		background-color: #f5f6f7;
		cursor: pointer;
	}
</style>

<section>
<h3>삭제할 상품을 클릭하세요</h3>
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
		<tr align="center" onClick="location.href='delete-form.jsp?idx=${product.idx }'">
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