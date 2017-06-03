<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css"
	rel="stylesheet" />

</head>
<body>


	<nav class="navbar navbar-default">
	<div class="container-fluid">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

			<a class="navbar-brand" href="./"> <img
				src='<c:url value="resources/images/logo.png" />' width="50px"
				height="25px" class="img-responsive" />
			</a>
		</div>

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Products <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach var="catlist" items="${catalist}">
							<li><a href="productFilter?id=${catlist.c_id}">${catlist.c_name}</a></li>
							<%--   <option value="${clist.c_id}">${clist.c_name}</option>
 --%>
						</c:forEach>

					</ul></li>
				<%-- <c:if test="${pageContext.request.userPrincipal.name  == 'admin'}"> --%>
				<li><a href="<c:url value="add"/>" role="button"
					aria-haspopup="true" aria-expanded="false">Add</a></li>
				<%-- </c:if> --%>
			</ul>


			<c:if test="${pageContext.request.userPrincipal.name  == 'admin'}">
				<li><a href="<c:url value="/admin" />">Admin</a></li>
			</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${pageContext.request.userPrincipal.name == null }">
					<%-- <li>
					<a href=' <c:url value="/signin" />'>Login</a>
					</li> --%>
					<li><a href="" data-toggle="modal" data-target="#login-modal"><img
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
	<%-- <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><img alt="logo" src="./resources/images/logo1.png" width="150" height="150">Shop4You</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav ">
       <li><a href="./">Home</a></li>
        <li><a href="admin/add">ADD</a></li>
        <li><a href="categoryList">CategoryList</a></li>
        <li><a href="supplierList">SupplierList</a></li>
         <li><a href="productList">Product List</a></li>        
      </ul>
        
       <ul class="nav navbar-nav"> 
		<li class="dropdown dropdown-large">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Select Category<b class="caret"></b></a>
				
				<ul class="dropdown-menu dropdown-menu-large row">
					
					<li class="col-sm-3">
						<ul>
							<li class="dropdown-header">Select your Category</li>
							<c:forEach var="clist" items="${catalist}">
								<li><a href="productFilter?id=${clist.c_id}">${clist.c_name}</a></li>              					

            				</c:forEach>
							
							
						</ul>
					</li>
				</ul>
				
			</li>
			<li>
				
				<form id="custom-search-form" class="form-search form-horizontal pull-right">
                <div class="input-append span12">
                    <input type="text" class="search-query" placeholder="Search">
                    <button type="submit" class="btn"><i class="icon-search"></i></button>
                </div>
            	</form>
            </li>
        <li><a href="#" data-toggle="modal" data-target="#login-modal"><img alt="" src="./resources/images/icon.png" width="20" height="20" /><br/>Sign In</a></li>
       </ul>

    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav> --%>
	<div class="modal fade" id="login-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		style="display: none;">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
					<div
						style="float: right; font-size: 80%; position: relative; top: -10px">
						<a href="#">Forgot password?</a>
					</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<div style="display: none" id="login-alert"
						class="alert alert-danger col-sm-12"></div>

					<!--  <form id="loginform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username or email">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="password" placeholder="password">
                                    </div>
                                    

                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    Button

                                    <div class="col-sm-12 controls">
                                      <a id="btn-login" href="#" class="btn btn-success">Login  </a>
                                      

                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>    
                             
 -->
					<div class="container-wrapper">
						<div class="login-container">
							<div id="login-box">

								<h2>Login with Username and Password</h2>

								<c:if test="${not empty msg}">
									<div class="msg">${msg}</div>
								</c:if>

								<form name="loginForm" action="<c:url value="/admin" />"
									method="post">
									<c:if test="${not empty error}">
										<div class="error" style="color: #ff0000;">${error}</div>
									</c:if>
									<div class="form-group">
										<label for="username">User: </label> <input type="text"
											id="username" name="username" class="form-control" />
									</div>
									<div class="form-group">
										<label for="password">Password:</label> <input type="password"
											id="password" name="password" class="form-control" />
									</div>

									<input type="submit" value="Submit" class="btn btn-default">

									<c:if
										test="${pageContext.request.userPrincipal.name  == 'admin'}">

										<li><a href="<c:url value="/admin" />">Admin</a></li>
									</c:if>


									<input type="hidden" name="${_csrf.parameterName}"
										value="${_csrf.token}" />
									<div class="form-group">
										<div class="col-md-12 control">
											<div
												style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
												Don't have an account! <a href="#"
													onClick="$('#loginbox').hide(); $('#signupbox').show()">
													Sign Up Here </a>
											</div>
										</div>
									</div>
								</form>

							</div>
						</div>
					</div>


				</div>
			</div>
		</div>
		<div id="signupbox" style="display: none; margin-top: 50px"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Sign Up</div>
					<div
						style="float: right; font-size: 85%; position: relative; top: -10px">
						<a id="signinlink" href="#"
							onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign
							In</a>
					</div>
				</div>
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
								<input type="text" class="form-control" name="mail"
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

						<div class="form-group">
							<label for="cpass" class="col-md-3 control-label">Confirm
								Password</label>
							<div class="col-md-9">
								<input type="password" class="form-control" name="cpass"
									id="cpass" placeholder="Re-enter password"
									pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$">
							</div>
						</div>

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
			</div>




		</div>
	</div>


</body>
</html>