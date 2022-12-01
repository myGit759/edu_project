<%@page import="day06.Gacha"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-action.jsp</title>
</head>
<body>
<%
	Gacha gc = (Gacha) application.getAttribute("gc");

	int result = gc.getButton();
%>

</body>
</html>