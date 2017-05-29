<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<%-- <div>
        <div class="col-md-12 bg-danger">
            <%@include file="header.jsp" %>
        </div>
        <div class="col-md-3 bg-info" style="height: 300px;">
            <%@include file="footer.jsp" %>
        </div>
        <div class="col-md-9 bg-primary" style="height: 300px;">
            <%@include file="header.jsp" %>
        </div>
        <div class="col-md-12 bg-success">
            <%@include file="footer.jsp" %>
        </div>
    </div> --%>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<h2>Category Details</h2>
<hr/>
  <form action="addCategory">
    <div class="form-group">
      <label for="c_id">Category  ID :</label>
      <input type="text" class="form-control" id="c_id" placeholder="Enter Category ID" name="c_id">
    </div>
    <div class="form-group">
      <label for="pwd">Category Name :</label>
      <input type="text" class="form-control" id="c_name" placeholder="Enter Category Name " name="c_name">
    </div>   
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
<br/>
<h2>Category Details</h2>
<hr/>
  <form action="addSupplier">
    <div class="form-group">
      <label for="c_id">Category  ID :</label>
      <input type="text" class="form-control" id="c_id" placeholder="Enter Category ID" name="c_id">
    </div>
    <div class="form-group">
      <label for="pwd">Category Name :</label>
      <input type="text" class="form-control" id="c_name" placeholder="Enter Category Name " name="c_name">
    </div>   
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
<br/>
<br/>
<hr/>
<br/>
<jsp:include page="footer.jsp"/>
</div>

 
 </div>
</body>
</html>