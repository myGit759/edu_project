<%@page import="test.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="test.Handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete.jsp</title>
<style>
	table{
		border-collapse: collapse;
	}
	td, th {
		border: 1px solid black;
		padding: 5px 10px;
	}
	a {
		text-decoration: none;
		color: inherit;
	}
</style>
</head>
<body>

<h1>학생 성적 관리 프로그램</h1>
<hr>



<nav>
	<ul>
		<li><a href="index.jsp">목록</a></li>
		<li><a href="add.jsp">추가</a></li>
		<li><a href="delete.jsp">삭제</a></li>
	</ul>
</nav>

<%	Handler hd = (Handler) application.getAttribute("handler"); 
	ArrayList<Student> list = hd.getList();
%>
<h3>삭제할 사람을 체크하세요</h3>
<form method="POST" action="delete-result.jsp">
<table>
	<tr>
		<th>※</th>
		<th>이름</th>	
	</tr>
	<%for(int i =0 ; i < list.size(); i++) { %>
	<tr>
		<td><input type="checkbox"  name="name" value="<%=list.get(i).getName() %>"></td>
		<td><%=list.get(i).getName() %></td>
	</tr>
	<%} %>
</table>
<p><input type="submit" value="삭제"></p>
</form>






</body>
</html>