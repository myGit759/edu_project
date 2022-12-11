<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao"  class="restaurant.RestaurantDAO" />
<%
	String[] values = request.getParameterValues("idx");
	pageContext.setAttribute("values", values);
	int row = dao.delete(values);
	boolean flag = (row != 0) ? true : false;
	pageContext.setAttribute("flag", flag);
%>


<script>
	const flag = ${flag == true}
	
	if(flag){
		alert('삭제 되었습니다')
		location.href = '${cpath}/list.jsp'
		// <a href="">와 비슷하다. 사용자가 직접 클릭하지 않아도 곧바로 이동한다
	}else{
		alert('삭제 실패')
		location.href = '${cpath}/list.jsp'
	}
</script>
</body>
</html>