<%@page import="test.Handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	Handler hd = (Handler) application.getAttribute("handler");
	
	// index.jsp 와 동일한 handler, list를 불러오는데 성공
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="user" class="test.Student"/>
<jsp:setProperty property="*" name="user"/>
<%
	hd.update(user);
	response.sendRedirect("index.jsp");
%>