<%@page import="test.Handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
	Handler hd = (Handler) application.getAttribute("handler");
	request.setCharacterEncoding("UTF-8");
	
	String[] values = request.getParameterValues("name");
	hd.delete(values);
%>
<div style="width: 300px; margin: auto; border: 3px solid red; padding: 20px;">
	<h3>삭제되었습니다</h3>
	<a href="index.jsp"><button>목록으로</button></a>
</div>