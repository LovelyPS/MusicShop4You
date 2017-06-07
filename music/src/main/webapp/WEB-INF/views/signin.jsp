<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
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

<div class="container">
<jsp:include page="header.jsp"></jsp:include>
<div class="container-wrapper">
<br/><br/><br/>
						<div class="login-container">
							<div id="login-box">

								<h2>Login</h2>

								<c:if test="${not empty msg}">
									<div class="msg" style="color: red;">${msg}</div>
								</c:if>
								<c:url var="login" value="/j_spring_security_check" />
	
		<form id="login-form" name="formLogin" action="${login}"  method="post" class="text-left">
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="lg_username" class="sr-only">Username</label>
						<input type="text" class="form-control" id="lg_username" name="j_username" placeholder="username">
					</div>
					<div class="form-group">
						<label for="lg_password" class="sr-only">Password</label>
						<input type="password" class="form-control" id="lg_password" name="j_password" placeholder="password">
					</div>

				</div>
				<!-- <button type="submit" class="login-button">Login</button> -->
				<input type="submit" name="submit" value="Login"/>
			</div>
			 <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
			<div class="form-group">
										<div class="col-md-12 control">
											<div
												style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
												Don't have an account! <a href="signUp" >
													Sign Up Here </a>
											</div>
										</div>
									</div>
		</form>
									
							

							</div>
						</div>
					</div>
					<br/><br/><br/><br/><br/>
					<jsp:include page="footer.jsp"></jsp:include>
					</div>
					
</body>
</html>