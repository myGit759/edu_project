<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
<form method="POST" action="add-action.jsp">
	<p><input type="number" name="idx" placeholder="INDEX" required autofocus></p>
	<p><input type="text" name="name" placeholder="NAME" required></p>
	<p><input type="number" name="price" placeholder="PRICE" required min="0"></p>
	<p><input type="text" name="imgPath" placeholder="IMGPATH" required></p>
	<p><input type="submit" value="추가"></p>
</form>
</section>
</main>

</body>
</html>