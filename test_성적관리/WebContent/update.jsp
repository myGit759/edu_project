<%@page import="test.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="test.Handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

<%	Handler hd = (Handler) application.getAttribute("handler"); 
	ArrayList<Student> list = hd.getList();
	String value = request.getParameter("name");
	
	int kor=0, eng=0, mat=0;
	for(Student st : list){
		if(st.getName().equals(value)){
			kor = st.getKor();
			eng = st.getEng();
			mat = st.getMat();
		}
	}
%>

<nav>
	<ul>
		<li><a href="index.jsp">목록</a></li>
		<li><a href="add.jsp">추가</a></li>
		<li><a href="delete.jsp">삭제</a></li>
	</ul>
</nav>
<form method="POST" action="update-result.jsp">
	<p><%=value %><input type="hidden" name="name" value="<%=value%>"></p>
	<p>국어점수<input type="number" name="kor" value="<%=kor %>" required></p>
	<p>영어점수<input type="number" name="eng" value="<%=eng %>" required></p>
	<p>수학점수<input type="number" name="mat" value="<%=mat %>" required></p>
	<p><input type="submit" value="수정">
</form>
</body>
</html>