<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO" />

<c:set var="dto" value="${dao.selectOne(param.idx) }" />

<section>
	<form method="POST" action="add-action.jsp">
		<p>
			<select name="category" required>
				<option value="">====카테고리 선택====</option>
				<option ${dto.category == '한식' ? 'selected' : '' }>한식</option>
				<option ${dto.category == '중식' ? 'selected' : '' }>중식</option>
				<option ${dto.category == '일식' ? 'selected' : '' }>일식</option>
				<option ${dto.category == '양식' ? 'selected' : '' }>양식</option>
				<option ${dto.category == '기타' ? 'selected' : '' }>기타</option>
			</select>
		</p>
		<p><input type="text" name="storename" value="${dto.storename }" placeholder="식당이름 입력" required></p>
		<p><input type="text" name="address" value="${dto.address }" placeholder="주소 입력" required></p>
		<p><input type="text"  name="storenumber" value="${dto.storenumber }" pattern="[0-9]+" placeholder="-없이 전화번호 입력" required></p>
		<p>
			<label><input type="radio" name="parking" value="y" ${dto.parking.equals("y") ? 'checked' : '' }>가능</label>
			<label><input type="radio" name="parking" value="n" ${dto.parking.equals("n") ? 'checked' : '' }>불가능</label>
		</p>
		<p><input type="submit" value="등록"></p>
	</form>
</section>

</body>
</html>