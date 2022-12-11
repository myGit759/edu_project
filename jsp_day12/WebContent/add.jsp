<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<form method="POST" action="add-action.jsp">
		<p>
			<select name="category" required>
				<option value="">====카테고리 선택====</option>
				<option>한식</option>
				<option>중식</option>
				<option>일식</option>
				<option>양식</option>
				<option>기타</option>
			</select>
		</p>
		<p><input type="text" name="storename" placeholder="식당이름 입력" required></p>
		<p><input type="text" name="address" placeholder="주소 입력" required></p>
		<p><input type="text"  name="storenumber" pattern="[0-9]+" placeholder="-없이 전화번호 입력" required></p>
		<p>
			<label><input type="radio" name="parking" value="y">가능</label>
			<label><input type="radio" name="parking" value="n">불가능</label>
		</p>
		<p><input type="submit" value="등록"></p>
	</form>
</section>
</body>
</html>