<%@page import="day06.UDG"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-result.jsp</title>
</head>
<body>
<h1>Up Down 결과</h1>
<hr>

<h3>당신이 선택한 값 : ${user }</h3>
<%-- <h3>컴터가 선택한 값 : ${cpu }</h3> --%>
<h3>${msg }</h3>

<%
	UDG udg = (UDG) application.getAttribute("udg");
	int user = Integer.parseInt(request.getParameter("user"));

	if(udg.getNum() != user) {%>
	<a href="ex02-form.jsp"><button>다시 !!</button></a>
	<%} %>
	
<%
	if (udg.getNum() == user) {%>
	<h4>도전 횟수 : ${udg.count }</h4>
<%	
		application.removeAttribute("udg");
%>
<a href="ex02-form.jsp"><button>초기화</button></a>
<%} %>


</body>
</html>