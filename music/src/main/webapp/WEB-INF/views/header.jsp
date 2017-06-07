<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="image" value="/resources/images" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="./resources/css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"
	rel="stylesheet" />
	
	
</head>
<body>


	<nav class="navbar navbar-default">
	<div class="container-fluid" style="background: black;">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

			<a class="navbar-brand" href="./"> <img
				src="${pageContext.request.contextPath}/resources/images/logo1.png" width="100px"
				height="50px" class="img-responsive" />
			</a>
		</div>

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
			<c:if test="${pageContext.request.userPrincipal.name  != 'admin@niit.com'}">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Products <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach var="catlist" items="${catalist}">
							<li><a href="productFilter?id=${catlist.c_id}">${catlist.c_name}</a></li>
						</c:forEach>

					</ul></li>
					</c:if>
				<%-- <c:if test="${pageContext.request.userPrincipal.name  == 'admin'}"> --%>
				<%-- <li><a href="<c:url value="admin/add"/>" role="button"
					aria-haspopup="true" aria-expanded="false">Add</a></li> --%>
				<%-- </c:if> --%>
			</ul>

                 <c:if test="${pageContext.request.userPrincipal.name  == 'admin@niit.com'}">
                          <a style="color:white;" href="<c:url value="admin/add"/>" >ADD</a>    
                 </c:if>
                 				<%-- <c:if test="${pageContext.request.userPrincipal.name  == null}">
                      <a style="color:black" href="<c:url value="admin/add"/>" >ADD</a></li>      
                 </c:if>
 --%>



			<c:if test="${pageContext.request.userPrincipal.name  == 'admin@niit.com'}">
				<li><a href="<c:url value="/admin" />">Admin</a></li>
			</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${pageContext.request.userPrincipal.name == null }">
					<%-- <li>
					<a href=' <c:url value="/signin" />'>Login</a>
					</li> --%>
					<li><a href="signin"><img
							alt="" src="./resources/images/icon.png" width="20" height="20" /><br />Sign
							In</a></li>

				</c:if>
				<c:if test="${pageContext.request.userPrincipal.name  != null}">
					<li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
					<li><a href='<c:url value="/logout" />'>Signout</a></li>
				</c:if>

			</ul>
		</div>
	</div>
	</nav>
	

</body>
</html>