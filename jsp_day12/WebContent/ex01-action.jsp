<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member2.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>member2 추가하기</h1>
<hr>

<jsp:useBean id="dao" class="member2.MemberDAO" />

<jsp:useBean id="user" class="member2.MemberDTO" />
<jsp:setProperty property="*" name="user"/>

<c:set var="row" value="${dao.insert(user) }" />

<h3>${row != 0 ? '성공' : '실패' }</h3>


</body>
</html>