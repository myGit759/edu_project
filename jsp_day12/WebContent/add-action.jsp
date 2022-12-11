<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO" />

<jsp:useBean id="user" class="restaurant.RestaurantDTO" />
<jsp:setProperty property="*" name="user"/>

<section>
	<h3>${dao.insert(user) == 1 ? '등록 완료' : '등록 실패' }</h3>
	<a href="${cpath }/list.jsp"><button>목록으로</button></a>
</section>

</body>
</html>