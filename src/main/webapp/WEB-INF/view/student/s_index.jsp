<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<head>

<meta charset="EUC-KR">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Student Managing</title>

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>
</head>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">
		<jsp:include page="s_nav.jsp" flush="false"></jsp:include>
		<!-- Begin Page Content -->
		<div class="container-fluid" style="">
			<div id="carouselExampleIndicators" class="carousel slide" 
				data-ride="carousel"
				style=" margin: auto; width: 50% ;">
				<ol class="carousel-indicators" style="height: 30%">
					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active" style="width: 700px" >
						<img class="d-block w-100"
							src="${pageContext.request.contextPath}/image/s_main.PNG"
							alt="First slide">
					</div>
					<div class="carousel-item" style="width: 700px">
						<img class="d-block w-100"
							src="${pageContext.request.contextPath}/image/s_main1.PNG"
							alt="Second slide">
					</div>
					<div class="carousel-item" style="width: 700px">
						<img class="d-block w-100"
							src="${pageContext.request.contextPath}/image/s_main2.PNG"
							alt="Third slide">
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div class="align-self-center" style="margin: 2%; height: 20%">
			<div class="card bg-white m-b-30">
				<div class="card-header bg-white">
					<h5 class="card-title text-black mb-0">Information</h5>
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<table class="table table-hover mb-0">
							<thead>
								<tr style="text-align: center">
									<th class="border-top-0">No</th>
									<th class="border-top-0">title</th>
									<th class="border-top-0">content</th>
									<th class="border-top-0">name</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${infoList }" var="info">
									<tr style="text-align: center">
										<td>${info.info_id}</td>
										<td>${info.info_title}</td>
										<td>${info.info_content}</td>
										<td>${info.info_name}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<!-- Footer -->
			<footer class="sticky-footer bg-white" >
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright Your Website 2019</span>
					</div>
				</div>
			</footer>
		</div>


	</div>

	</div>
	</div>


	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>




</body>
</html>