<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
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
<br/>
<hr/>
<br/>
<jsp:include page="footer.jsp"/>
</div>

</body>
</html>