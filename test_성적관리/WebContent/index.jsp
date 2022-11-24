<%@page import="test.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="test.Handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
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


<%
	Handler hd = (Handler)application.getAttribute("handler");
	if(hd == null){
		hd = new Handler();
	}
	application.setAttribute("handler", hd);
	
	ArrayList<Student> list = hd.getList();
%>
<table>
	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
		<th>합계</th>
		<th>평균</th>
	</tr>
	<% for(int i = 0; i < list.size(); i++) { %>
	<tr>
		<td><%=i+1 %></td>
		<td><%=list.get(i).getName() %>
			<form action="update.jsp">
				<input type="hidden" name="name" value="<%=list.get(i).getName() %>">
				<input type="submit" value="수정">
			</form></td>
		<td><%=list.get(i).getKor() %>점</td>
		<td><%=list.get(i).getEng() %>점</td>
		<td><%=list.get(i).getMat() %>점</td>
		<td><%=list.get(i).getSum() %>점</td>
		<td><%out.print(String.format("%.2f",list.get(i).getAvg())); %></td>
	</tr>
	<%} %>
</table>


</body>
</html>