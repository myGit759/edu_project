<%@page import="day07.*,java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cpath = request.getContextPath();
	pageContext.setAttribute("cpath", cpath);
	
	MemberHandler memberHandler = (MemberHandler) application.getAttribute("memberHandler");
	if(memberHandler == null){
		memberHandler = new MemberHandler();
		application.setAttribute("memberHandler", memberHandler);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>
<style>

	a {
		text-decoration: none;
		color: inherit;
	}
	a : hober {
		text-decoration: underline;
	}
	main {
		width: 1200px;
		display: flex;
		margin: auto;
	}
	aside {
		width: 20%;
		border-right: 1px solid brown;
	}
	section {
		margin-left: 10px;
		width: 80%;
	}
	.false {
		background-color: #ff84a3d0;
	}
	.fst{
		visibility: hidden;
	}
	.duple {
		visibility: visible;
		margin-left: 10px;
	}
	section p:nth-child(1) {
		display: flex;
	}
	.id{
		font-weight: bold;
		font-size: 20px;
	}
	.login{
		display: list-item;
	}
	.logout{
		display: none;
	}
</style>
</head>
<body>

<header>
	<h1><a href="${cpath }">회원관리</a></h1>
	<hr>
</header>

<main>
<aside>
	<div>
		<span>${not empty login ? '반갑습니다! ' : null }</span>
		<span class="id">${not empty login ? login.username : null }</span>
		<span>${not empty login ? ' 님' : null }</span>
	</div>
	<nav>
		<ul>
			<li class="${login.userid == 'admin' ? 'login' : 'logout' }"><a href="${cpath }/list.jsp">회원목록 / 검색</a></li>
			<li>
				<a href="${cpath }/${empty login ? 'login.jsp' : 'logout.jsp'}">
					${empty login ? '로그인' : '로그아웃' }
				</a>
			</li>
			<li class="${empty login ? 'login' : 'logout' }"><a href="${cpath }/join.jsp">가입</a></li>
			<li><a href="${cpath }/mypage.jsp">마이페이지</a></li>
		</ul>
	</nav>
</aside>

