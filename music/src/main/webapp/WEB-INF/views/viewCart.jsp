<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Cart</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
    <link href="./style.css" rel="stylesheet" type="text/css"  />
    <link rel="stylesheet" href="bootstrap.min.css"/>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet"/>
   
</head>
<body>
<jsp:include page="header.jsp"/>

<br/>
<div class="container">
<div class="row">
   
     
   <p> </p><p> </p>
   
       <div class="col-md-10 col-md-offset-1">

           <div class="panel panel-default panel-table">
             <div class="panel-heading">
               <div class="row">
                 <div class="col col-xs-6">
                   <h3 class="panel-title">Your Cart</h3>
                 </div>
               </div>
             </div>
             <div class="panel-body">
               <table class="table table-striped table-bordered table-list">
                 <thead>
                   <tr>
                     
                       <th>Name</th>
                       <th>Price</th>
                       <th>Quantity</th>
                       <th>Image</th> 
                       <th>Total</th>
                       <th><em class="fa fa-cog"></em></th>
                                                                                              
                   </tr> 
                 </thead>
                 <tbody>
                         
                        <c:set var="tot" value="0"></c:set>
                        <c:forEach items="${cartlist}" var="p">
                        <c:set var="t" value="${p.c_price*p.c_quantity}"></c:set>
                		<c:set var="tot" value="${tot+t }"/>
                         <tr>
                        
                           <td>${p.product.p_name}</td>        
                           <td><i class="fa fa-inr" aria-hidden="true"></i>${p.c_price}</td> 
                           <td>${p.c_quantity }</td>
                           <td><img src="./resources/product/${p.product.p_image}"  class="img-rounded" alt="${p.product.p_name }" width="75px" height="50px"/></td>         
                           <td><i class="fa fa-inr" aria-hidden="true"></i>${p.c_price*p.c_quantity}</td>
                            <td>
                             <a class="btn btn-danger" href="./cart_delete?id=${p.cart_id}"><em class="fa fa-trash"></em></a>
                           </td>
                           <tr>  
                            </c:forEach>     
                       
                       </tbody>
               </table>
           
             </div>
             <div class="panel-footer">
               <div class="row">
                 <h1 style="color: red;">Grand Total = <c:out value="${tot}"/></h1>  
               </div>
               <div class="btn-group wishlist">
					<a href="./">
						<button type="button" class="btn btn-danger">
							Continue Shopping 
						</button>
						</a>
					</div>
						<form action="customerDetails" method="post">
					 <div class="btn-group cart">	
				        <input type="hidden" value="${tot}" name="tot">
						<button type="submit" class="btn btn-danger">
							Check Out
						 </button>				
					</div>
					</form>
             </div>
             
           </div>

</div></div>
	</div>
    

<jsp:include page="footer.jsp"/>
</body>
</html>