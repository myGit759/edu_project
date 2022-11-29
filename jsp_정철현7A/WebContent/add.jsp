<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<section>
	<%if(request.getMethod().equals("GET")){ %>
		<form method="POST">
			<p><input type="text" name="name" placeholder="이름" required autofocus></p>
			<p>
				<input type="text" name="fNumber" placeholder="010" required >-
				<input type="text" name="sNumber" placeholder="1234" required >-
				<input type="text" name="thNumber" placeholder="5678" required >
			</p>
			<p><input type="submit" value="저장">	
		</form>
	<%} %>
	
	<%if(request.getMethod().equals("POST")){ %>
	<jsp:useBean id="user" class="phoneBook.PhoneBook" />
	<jsp:setProperty property="*" name="user"/>
	${handler.insert(user) }
	<%response.sendRedirect(request.getContextPath()+"/list.jsp");
	} %>
</section>

</main>
</body>
</html>