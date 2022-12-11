<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05.jsp</title>
<style>
	div#wrap {
		width: 900px;
		display: flex;
		flex-flow: wrap;
		margin: 20px auto;
	}
	div.item {
		width:200px;
		margin: 10px;
		padding:10px;
		border: 1px solid #dadada;
		text-align: center;
	}
	div.item:hover {
		background-color: antiquewhite;
		cursor: pointer;
	}
</style>
</head>
<body>

<h1>상품 목록</h1>
<hr>

<jsp:useBean id="dao" class="day10.ProductDAO" />

<div id="wrap">

	<c:forEach var="pt" items="${dao.selectList() }">

	<div class="item">
		<div class="img">
			<a href="ex05-detail.jsp?idx=${pt.idx }" title="상세보기">
			<img src="img/${pt.imgPath }" width="150"></a>
		</div>
		<div>${pt.name }</div>
		<div>${pt.price }원</div>
	</div>

	</c:forEach>

</div>




</body>
</html>