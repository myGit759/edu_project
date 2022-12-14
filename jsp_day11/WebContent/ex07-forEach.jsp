<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex07-forEach.jsp</title>
<style>
	table {
		border-collapse: collapse;
		border: 2px solid black;
		text-align: center;
	}
	thead {
		background-color: #dadada;
	}
	th, td {
		padding : 10px 20px;
		border: 1px solid black;
	}
	body {
		width:1500px;
		margin: auto;
	}
</style>
</head>
<body>

<%
	String[] arr = { "ASP", "PHP", "JSP", "flask", "node.JS" };
	pageContext.setAttribute("arr", arr);
%>
<h1>c:forEach</h1>
<hr>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table>
	<thead>
		<tr>
			<th>item</th>
			<th>var</th>
			<th>st.index</th>
			<th>st.count</th>
			<th>st.first</th>
			<th>st.last</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="i" begin="0" end="4" step="1" varStatus="st">
		<tr>
			<td>${arr[i] }</td>
			<td>${i }</td>
			<td>${st.index }</td>
			<td>${st.count }</td>
			<td>${st.first }</td>
			<td>${st.last }</td>
		</tr>
		</c:forEach>
	</tbody>	
</table>

<br>

<table>
	<thead>
		<tr>
			<th>var</th>
			<th>st.index</th>
			<th>st.count</th>
			<th>st.first</th>
			<th>st.last</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${arr }" varStatus="st">
		<tr>
			<td>${item }</td>
			<td>${st.index }</td>
			<td>${st.count }</td>
			<td>${st.first }</td>
			<td>${st.last }</td>
		</tr>
		</c:forEach>
	</tbody>	
</table>

</body>
</html>