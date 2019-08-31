<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/login.css">
<script type="text/javascript">
	$(document).ready(function() {
		$('#loginbtn').click(function() {

			var Id = $("#id").val();
			var PW = $("#password").val();
		
			var select = $('input[name="selectinfo"]:checked').val();


			if(select == null){
				alert("사용자의 직업을 선택해주세요.");
				return;
				}
			
			if (Id == "") {
				alert("아이디를 입력하세요.");
				$("#id").focus();
				return;
			}
			if (PW == "") {
				alert("비밀번호를 입력하세요.");
				$("#password").focus();
				return;
			}
			if(select == "student"){
				document.form2.action = "${localhost}/studentLogin.do"
				document.form2.submit();
				return;
				}
			if(select == "professior"){
				document.form2.action = "${localhost}/professiorLogin.do"
				document.form2.submit();
				return;
				}
		
		})

	})
</script>

</head>
<body>
	


	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->
			<!-- Icon -->
			<div class="fadeIn first">
				<img src="${pageContext.request.contextPath}/image/ManagingLogo.png"
					id="icon" alt="User Icon" />
			</div>

			<!-- Login Form -->
			<form name="form2" method="post">

				<input type="text" id="id" class="fadeIn second" name="id"
					placeholder="ID"> <input type="text" id="password"
					class="fadeIn third" name="password" placeholder="Password">

				<div class="fadeIn fourth">

					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" class="custom-control-input "
							id="defaultInline1" name="selectinfo" value="professior"> <label
							class="custom-control-label" for="defaultInline1">교수</label>
					</div>
					<div class="custom-control custom-radio custom-control-inline">
						<input type="radio" class="custom-control-input "
							id="defaultInline2" name="selectinfo" value="student"> <label
							class="custom-control-label" for="defaultInline2">학생</label>
					</div>
					<input type="button" id="loginbtn" value="Log In">	<c:if test="${msg == 'failure'}">
				<div style="color: red; text-align: center">아이디 또는 비밀번호가 일치하지
					않습니다.</div>
			</c:if>
				
				</div>
			</form>
		</div>
	</div>
</body>
</html>