<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05-detail.jsp</title>
</head>
<body>

<h1>${param.idx }번 상품 상세보기</h1>
<hr>
<jsp:useBean id="dao" class="day10.ProductDAO" />
<c:set var="pt" value="${dao.selectOne(param.idx) }" />
<div>
	<div class="item">
		<div class="img">
			<a href="ex05-detail.jsp?idx=${pt.idx }" title="상세보기">
			<img src="img/${pt.imgPath }" width="150"></a>
		</div>
		<div>${pt.name }</div>
		<div>${pt.price }원</div>
	</div>
</div>

</body>
</html>