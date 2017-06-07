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
						<div class="panel-body">
					<form id="signupform" method="post" class="form-horizontal"
						action="registration">

						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
							<span></span>
						</div>



						<div class="form-group">
							<label for="mail" class="col-md-3 control-label">Email</label>
							<div class="col-md-9">
								<input type="email" class="form-control" name="mail"
									placeholder="Email Address" required>
							</div>
						</div>

						<div class="form-group">
							<label for="name" class="col-md-3 control-label">Name</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="name" id="name"
									placeholder="Enter your Name" required>
							</div>
						</div>
						<div class="form-group">
							<label for="age" class="col-md-3 control-label">Age</label>
							<div class="col-md-9">
								<input type="number" class="form-control" name="age" id="age"
									placeholder="Enter Your Age" required>
							</div>
						</div>
						<div class="form-group">
							<label for="address" class="col-md-3 control-label">Address</label>
							<div class="col-md-9">
								<input type="text" class="form-control" name="address"
									id="address" placeholder="Enter Your Address">
							</div>
						</div>
						<div class="form-group">
							<label for="phone" class="col-md-3 control-label">Phone
								Number</label>
							<div class="col-md-9">
								<input type="number" class="form-control" name="phone"
									id="phone" placeholder="Enter Your Phone Number">
							</div>
						</div>
						<div class="form-group">
							<label for="password" class="col-md-3 control-label">Password</label>
							<div class="col-md-9">
								<input type="password" class="form-control" name="passwd"
									id="passwd" placeholder="Password"
									pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$">
							</div>
						</div>

						<!-- <div class="form-group">
							<label for="cpass" class="col-md-3 control-label">Confirm
								Password</label>
							<div class="col-md-9">
								<input type="password" class="form-control" name="cpass"
									id="cpass" placeholder="Re-enter password"
									pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$">
							</div>
						</div> -->

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<button id="btn-signup" type="submit" class="btn btn-info">
									<i class="icon-hand-right"></i> Sign Up
								</button>

							</div>
						</div>





					</form>
				</div>
				
					<br/><br/><br/><br/><br/>
					<jsp:include page="footer.jsp"></jsp:include>
					</div>
					
</body>
</html>