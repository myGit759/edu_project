<%@page import="phoneBook.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("cpath",request.getContextPath());
	
	Handler hd = (Handler) application.getAttribute("handler");
	if(hd == null){
		hd = new Handler();
		application.setAttribute("handler", hd);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>
<style>
	main, aside, section, nav {
		margin: 0;
		padding: 0;
	}
	main{
		display: flex;
		width: 600px;
		margin: auto;
	}
	aside{
		width: 20%;
		background-color: lightyellow;
	}
	section{
		width: 80%;
	}
	a {
		text-decoration: none;
		color: inherit;
	}
	a:hover {
		text-decoration: underline;
	}
	table{
		border-collapse: collapse;
		width: 400px;
		margin: 20px auto;
		text-align: center;
	}
	thead th {
		background-color: chocolate;
		padding: 5px 10px;
		color:white;
		border-bottom: 1px solid #d9af61;
	}
	tbody > tr:hover {
		background-color: #f5f6f7;
		cursor: pointer;
	}
	tbody > tr > td:nth-child(1),
	tbody > tr > td:nth-child(2){
		border-bottom: 1px solid #d9af61;
	}
	tbody > tr > td:nth-child(3),
	tbody > tr > td:nth-child(4){
		visibility: hidden;
		padding: 5px 0;
	}
	tbody > tr:hover > td:nth-child(3),
	tbody > tr:hover > td:nth-child(4){
		visibility: visible;
	}
	section > form > p:nth-child(2) {
		display: flex; 
	}
	section > form > p:nth-child(2) > input {
		width:50px;
	}
	tr > td > button {
		margin: 0;
	}
	section > form {
		margin:0 20px; 
	}
</style>
</head>
<body>

<h1><a href="${cpath }">전화번호부</a></h1>
<hr>

<main>
<aside>
	기능
	<nav>
		<ul>
			<li><a href="${cpath }/list.jsp">목록</a></li>
			<li><a href="${cpath }/add.jsp">생성</a></li>
			<li><a href="${cpath }/delete.jsp">삭제</a></li>
		</ul>
	</nav>
</aside>



