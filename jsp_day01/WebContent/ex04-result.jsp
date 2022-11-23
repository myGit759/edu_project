<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04-result.jsp</title>
</head>
<body>

<h1>입력값(파라미터) 받아서 처리하기</h1>
<hr>

<%
	
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String checkAdult;
	
	checkAdult = Integer.parseInt(age) > 19 ?  "성인" : "미성년자";
%>

<h3><%=name %>님의 나이는 <%=age %>살이고, <%=checkAdult %>입니다</h3>
<div>
	<a href="ex04-form.jsp"><button>돌아가기</button></a>
</div>
</body>
</html>