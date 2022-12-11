<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<jsp:useBean id="dao" class="product.ProductDAO" />

<c:set var="dto" value="${dao.selectOne(param.idx) }" />
<section>
<h3>${dto.name }(${dto.price }원)</h3><h4>품목을 삭제하시겠습니까?</h4>
<a href="delete-action.jsp?idx=${param.idx }"><button>네</button></a>
<a href="delete.jsp"><button>아니요</button></a>
</section>
</main>


</body>
</html>