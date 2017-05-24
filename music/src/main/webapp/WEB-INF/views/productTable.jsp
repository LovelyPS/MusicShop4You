<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List"%>
<%@page import="com.niit.music.daoimpl.MusicDAOImpl"%>
<%@page import="com.niit.music.model.Product"%>
<%@page import="com.niit.music.dao.MusicDAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
 	<link href="./resources/css/style.css" rel="stylesheet" type="text/css"  />
    <link rel="stylesheet" href="bootstrap.min.css"/>
    <style>.carousel-inner > .item > img { width:100%; height:400px; } </style>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
 <jsp:include page="header.jsp"></jsp:include>
    <hr/>
    <br/>
    <br/>
   
    <br/>
    <br/>


 <h1>ProductNames</h1>
 <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Brand</th>
                        <th>Name</th>
                        <th>Price</th>
                       
                    </tr>
                </thead>
                <tbody>
                
                   <c:forEach var="listValue" items="${productlist}">
						<tr>
							<td>
								<li>${listValue.p_id}</li>
							</td>
							<td>
								<li>${listValue.p_brand}</li>
							</td>
							<td>
								<li>${listValue.p_name}</li>
							</td>
							<td>
								<li>${listValue.p_price}</li>
							</td>
						</tr>
					</c:forEach>
                </tbody>
            </table>         
 
<%--

   MusicDAOImpl m=new MusicDAOImpl();
   List<Product> plist=m.getProducts();
   out.println("<table border=\"1\">");
   for (int i = 0; i <plist.size(); i++) 
   {
	   out.println("<tr>");
       out.println("<td>" +plist.get(i).getP_name() + "</td>");
       
       out.println("</tr>");
   }
  
   out.println("</table>");
   --%>
   

<hr/>
    
    
    
 <br/>


<jsp:include page="footer.jsp"></jsp:include>
</div>


</body>
</html>