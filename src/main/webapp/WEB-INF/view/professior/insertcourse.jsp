<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>강좌 개설</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

<script type="text/javascript">
	function SelectValue(idvalue) {
	}
</script>

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">
		<jsp:include page="p_nav.jsp" flush="false"></jsp:include>
		<div style="margin: 5%">


			<div class="row">
				<div class="col-md-4 order-md-2 mb-4">
					<h4 class="d-flex justify-content-between align-items-center mb-3">
						<span class="text-muted">시간표</span> <span
							class="badge badge-secondary badge-pill">3</span>
					</h4>
					<ul class="list-group mb-3">
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Product name</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$12</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Second product</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$8</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Third item</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$5</span>
						</li>

						<li class="list-group-item d-flex justify-content-between"><span>Total
								(USD)</span> <strong>$20</strong></li>
					</ul>

				</div>
				<div class="col-md-8 order-md-1">
					<h4 class="mb-3">강좌 개설</h4>
					<form class="needs-validation" action="/insertco.do" method="post">
						<div class="row">
							<div class="col-md-6 mb-3">
								<label for="firstName">강좌 이름</label> <input type="text"
									class="form-control" id="c_name" name="c_name" placeholder=""
									value="" required=""> <input type="hidden"
									class="form-control" id="p_id" name="p_id" placeholder=""
									value="${sessionScope.id}">
									 <input type="hidden"
									class="form-control" id="p_name" name="p_name" placeholder=""
									value="${sessionScope.name}">
							</div>
							<div class="col-md-3 mb-3">
								<label for="cc-cvv">총원</label> <input type="text"
									class="form-control" id="personnel" name="personnel"
									placeholder="" required="">
							</div>
						</div>
						<div class="row">
							<div class="col-md-3 mb-3">
								<label for="cc-cvv">시작 시간</label> <select name="c_starttime"
									class="form-control">
									<option value="09">09</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
									<option value="13">13</option>
									<option value="14">14</option>
									<option value="15">15</option>
									<option value="16">16</option>
									<option value="17">17</option>
								</select>
							</div>
							<label for="cc-cvv">~</label>
							<div class="col-md-3 mb-3">
								<label for="cc-cvv">종료 시간</label> <select name="c_endtime"
									class="form-control">
									<option value="09">09</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
									<option value="13">13</option>
									<option value="14">14</option>
									<option value="15">15</option>
									<option value="16">16</option>
									<option value="17">17</option>
								</select>
							</div>
							<div class="col-md-3 mb-3">
								<label for="cc-cvv">요일</label>
									<select name="c_timeweek" class="form-control">
										<option value="Mon">Mon</option>
										<option value="Tue">Tue</option>
										<option value="Wen">Wen</option>
										<option value="Thu">Thu</option>
										<option value="Fri">Fri</option>
								</select>
							</div>
						</div>

						<div class="mb-3">
							<label>강좌 설명</label> <input type="text" class="form-control"
								id="c_content" name="c_content" placeholder="content...."
								style="height: 300px" required="">
						</div>

						<hr class="mb-4">
						<button class="btn btn-primary btn-lg btn-block" type="submit">개설
							신청</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>

</html>