<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.jsp</title>
<style>
	table {
		border: 2px solid black;
		border-collapse: collapse;
	}
	thead th {
		background-color: #dadada;
	}
	td, th {
		padding: 10px 20px;
		border: 1px solid grey;
	}
</style>
</head>

<body>

<h1>상품 목록 표</h1>
<hr>
<form>
	<p>
		<input type="search" name="keyword" placeholder="검색" autocomplete="off" autofocus>
		<input type="submit" value="검색">
	</p>
</form>

<jsp:useBean id="dao" class="day10.ProductDAO"/>
<table>
	<thead>
		<tr>
			<th>IDX</th>
			<th>NAME</th>
			<th>PRICE</th>
			<th>IMGPATH</th>
		</tr>
	</thead>
	<c:forEach var="pt" items="${empty param.keyword ? dao.selectList() :  dao.selectListByName(param.keyword)}">
	<tr>
		<td>${pt.idx }</td>
		<td>${pt.name }</td>
		<td>${pt.price }</td>
		<td>${pt.imgPath }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>