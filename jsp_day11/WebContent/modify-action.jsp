<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="user" class="product.ProductDTO" />
<jsp:setProperty property="*" name="user"/>

<jsp:useBean id="dao" class="product.ProductDAO" />

<section>
<h3>${dao.update(user) == 1 ? '수정 성공' : '수정 실패' }</h3>
<a href="${cpath }/list.jsp"><button>목록으로</button></a>
</section>
</main>

</body>
</html>