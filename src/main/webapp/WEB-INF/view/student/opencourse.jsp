<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>개설 강좌 조회</title>

<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">
<style type="text/css">
.filterable {
	margin-top: 15px;
}

.filterable .panel-heading .pull-right {
	margin-top: -20px;
}

.filterable .filters input[disabled] {
	background-color: transparent;
	border: none;
	cursor: auto;
	box-shadow: none;
	padding: 0;
	height: auto;
}

.filterable .filters input[disabled]::-webkit-input-placeholder {
	color: #333;
}

.filterable .filters input[disabled]::-moz-placeholder {
	color: #333;
}

.filterable .filters input[disabled]:-ms-input-placeholder {
	color: #333;
}
</style>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="s_nav.jsp" flush="false"></jsp:include>
		
			
			<%
				String msg = request.getParameter("msg");
			%>
			<c:if test="${msg == 'failure'}"><div>sdfafsadfa</div></c:if>
		<div class="card" style="margin: 1%;">
			
			<div class="card-header">개설 강좌</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-hover mb-0"
						style="text-align: center; vertical-align: middle;">
						<thead>
							<tr>
								<th class="border-top-0">No</th>
								<th class="border-top-0">강좌 이름</th>
								<th class="border-top-0">교수</th>
								<th class="border-top-0">시간</th>
								<th class="border-top-0">신청인원</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<!-- 아이디를 지정해줘서 index값으로 foreach 값확인 -->
							<c:forEach items="${opencourseList }" var="opencourse"
								varStatus="vs">
								<tr style="text-align: center">
									<td>${opencourse.inc_no}</td>
									<td>${opencourse.inc_name}</td>
									<td>${opencourse.p_name}</td>
									<td>${opencourse.c_timeweek}${opencourse.c_starttime }:00
										~ ${opencourse.c_endtime }:00</td>
									<td>${opencourse.personnel}</td>
									<td><a class="btn btn-success btn-circle btn-sm"
										href="/courseapplication.do?id=${sessionScope.id}&Inc_no=${opencourse.inc_no}"
										data-toggle="modal"
										data-target="#ApplicationModal${vs.index }"> <i
											class="fas fa-check"></i>
									</a></td>
									<%-- <a href="/courseapplication.do?c_no1=${opencourse.inc_no }"   --%>
									<div class="modal fade" id="ApplicationModal${vs.index }"
										tabindex="-1" role="dialog"
										aria-labelledby="exampleModalLabel" aria-hidden="true">
										<div class="modal-dialog" role="document">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">수강신청</h5>
													<button class="close" type="button" data-dismiss="modal"
														aria-label="Close">
														<span aria-hidden="true">×</span>
													</button>
												</div>
												<div class="modal-body">수강신청 하시겠습니까?</div>
												<div class="modal-footer">
													<button class="btn btn-secondary" type="button"
														data-dismiss="modal">No</button>
													<a class="btn btn-primary"
														href="/courseapplication.do?id=${sessionScope.id}&Inc_no=${opencourse.inc_no}">Yes</a>
												</div>
											</div>
										</div>
									</div>

								</tr>

							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

		<div class="card" style="margin: 1%;">
			<div class="card-header">신청한 강좌</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-hover mb-0"
						style="text-align: center; vertical-align: middle;">
						<thead>
							<tr>
								<th>No</th>
								<th>강좌 이름</th>
								<th>교수</th>
								<th>시간</th>
								<th>신청인원</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${addcourseList }" var="addcourse"
								varStatus="vs">
								<tr style="text-align: center">
									<td>${addcourse.inc_no}</td>
									<td>${addcourse.inc_name}</td>
									<td>${addcourse.p_name}</td>
									<td>${addcourse.c_timeweek}${addcourse.c_starttime }:00~
										${addcourse.c_endtime }:00</td>
									<td>${addcourse.personnel}</td>
									<td><a class="btn btn-danger btn-circle btn-sm"
										href="/courseapplication.do?id=${sessionScope.id}&Inc_no=${opencourse.inc_no}"
										data-toggle="modal"
										data-target="#ApplicationModal1${vs.index }"> <i
											class="fas fa-trash"></i>


									</a></td>
									<%-- <a href="/courseapplication.do?c_no1=${opencourse.inc_no }"   --%>
									<div class="modal fade" id="ApplicationModal1${vs.index }"
										tabindex="-1" role="dialog"
										aria-labelledby="exampleModalLabel" aria-hidden="true">
										<div class="modal-dialog" role="document">
											<div class="modal-content">
												<div class="modal-header">
													<h5 class="modal-title" id="exampleModalLabel">수강신청</h5>
													<button class="close" type="button" data-dismiss="modal"
														aria-label="Close">
														<span aria-hidden="true">×</span>
													</button>
												</div>
												<div class="modal-body">수강을 취소하시겠습니까?</div>
												<div class="modal-footer">
													<button class="btn btn-secondary" type="button"
														data-dismiss="modal">No</button>
													<a class="btn btn-primary"
														href="/coursedelete.do?s_id2=${sessionScope.id}&Inc_no=${addcourse.inc_no}">Yes</a>
												</div>
											</div>
										</div>
									</div>

								</tr>

							</c:forEach>
						</tbody>
			
					</table>
		
				</div>
			</div>
		</div>
		
	</div>




</body>
<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>
</html>