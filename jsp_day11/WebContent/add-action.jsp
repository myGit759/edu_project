<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="user" class="product.ProductDTO" />
<jsp:setProperty property="*" name="user" />

<section>
<jsp:useBean id="dao" class="product.ProductDAO" />
<h3>${dao.insert(user) == 1 ? '추가 성공' : '추가 실패' }</h3>
<a href="${cpath }/list.jsp"><button>목록으로</button></a>
</section>
</main>

</body>
</html>