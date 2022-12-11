<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<jsp:useBean id="dao" class="product.ProductDAO" />

<section>
<h3>${dao.delete(param.idx) == 1 ? '삭제 성공' : '삭제 실패' }</h3>
<a href="${cpath }/list.jsp"><button>목록으로</button></a>
</section>
</main>

</body>
</html>