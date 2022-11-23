<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz-form.jsp</title>
<style>
input {
	all: unset; /* 태그에 적용된 모든 기본 속성을 해제한다 */
	padding: 5px 10px;
	border: 1px solid grey; /* 두께는 있지만, 색상은 없다 (투명) */
	font-weight: bold;
	width: 100%;
	height:35px;
}

input:focus { /* onfocus  */
	border: 2px solid green !important;
}

div {
	
}

#root {
	width: 900px;
	margin: auto;
}

#form {
	width: 500px;
	margin: auto;
}

.logo {
	display: flex;
	justify-content: center;
}

div.info_birth {
	display: flex;
	justify-content: space-between;
}

.birth {
	display: inline-block;
	width: 100px;
	margin:auto;
}

a {
	text-decoration: none;
	font-weight: bold;
	font-size: 60px;
	height: 70px;
	color: #04cf5c;
}

div.info {
	weight: bold;
}



</style>
</head>
<body style="background-color: #f5f6f7">
	<!-- 
	HTML과 CSS위주로 네이버 회원가입 페이지를 작성
 -->

	<div id="root">
		<div id="form">
			<div class="logo">
				<a href="https://www.naver.com">NAVER</a>
			</div>

			<div class="input">
				<form action="Quiz-result.jsp">
					<div class="info">아이디</div>
					<p>
						<input type="text" name="id" > 
					</p>
					
					<div class="info">비밀번호</div>
					<p>
						<input type="password" name="pw">
					</p>
					
					<div class="info">비밀번호 확인</div>
					<p>
						<input type="password" name="pw2">
					</p>
					
					<div class="info">이름</div>
					<p>
						<input type="text" name="name">
					</p>
					
					<div class="info">생년월일</div>
					<div class="info_birth">
						<p>
							<input class="birth" type="text" name="birth-y"
								placeholder="년(4자)">
						</p>
						<p>
							<select class="birth" name="birth-M">
								<option>월</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select> <input class="birth" type="text" name="birth-d" placeholder="일">
						</p>
					</div>
					
					<div class="info">성별</div>
					<p>
						<select name="gender">
							<option>성별</option>
							<option value="남">남</option>
							<option value="여">여</option>
							<option value="none">선택 안함</option>
						</select>
					</p>
					
					<div class="info">본인확인 이메일</div>
					<p>
						<input type="email" name="email">
					</p>
					
					<div class="info">휴대전화</div>
					<p>
						<input type="text" name="phoneNum">
					</p>
					
					<p>
						<input type="submit" value="가입하기">
					</p>



				</form>
			</div>

		</div>
	</div>

</body>
</html>