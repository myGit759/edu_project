<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-action.jsp</title>
</head>
<body>

<%@ page import="day06.UDG" %>
<%
	UDG udg = (UDG) application.getAttribute("udg");
	if (udg == null) {
		udg = new UDG();
		application.setAttribute("udg", udg);
	}
	
	int cpu = udg.getNum();
	int user = Integer.parseInt(request.getParameter("user"));
	
	String msg = udg.getResult(cpu, user);
	
	request.setAttribute("cpu", cpu);
	request.setAttribute("user", user);
	request.setAttribute("msg", msg);
	
	request.getRequestDispatcher("ex02-result.jsp").forward(request, response);
%>

</body>
</html>