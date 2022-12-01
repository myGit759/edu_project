<%@page import="day06.Gacha"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-form.jsp</title>
</head>
<body>
<% 
	String money = (String) application.getAttribute("money");
	if(money == null){
		application.setAttribute("money", request.getParameter("usermoney"));
	}
	
	Gacha gc = (Gacha) application.getAttribute("gc");
	if(gc == null){
		gc = new Gacha();
		application.setAttribute("gc", gc);
	}
	gc.setMoney(Integer.parseInt(request.getParameter("usermoney")));
%>
<h1>강화중...</h1>
<hr>

<h3>잔고 : ${money }</h3>
<h3>비용 : ${gc.cost}</h3>
<a href="ex03-action.jsp"><button>강화하기</button></a>
</body>
</html>