<!DOCTYPE html>
<!-- <html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"> -->
	<html>
	 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="utf-8" />
	<title>ProductList</title>
	<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
	<script src="./resources/js/jquery.min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="./resources/css/jquery.dataTables.min.css">
	<link href="./resources/font-awesome.min.css" rel='stylesheet' type='text/css'>

</head>

<body>

<br/>
<div class="container">
<jsp:include page="header.jsp"/>
<div style="float: right;">
<a style="color:black" href="<c:url value="add"/>" >ADD</a></li>|<a href="productList">View Products</a>|<a href="categoryList">View Categories</a>|<a href="supplierList">View Suppliers</a>
</div>
<div class="row">
   
   <p></p>
   <h1>Products List</h1>  
   <c:if test="${not empty msg}">
									<div class="msg" style="color: red;">${msg}</div>
								</c:if> 
   <p> </p><p> </p>
   
       <div class="col-md-10 col-md-offset-1">

           <div class="panel panel-default panel-table">
             <div class="panel-heading">
               <div class="row">
                 <div class="col col-xs-6">
                   <h3 class="panel-title">Product Data Table</h3>
                 </div>
                 
               </div>
             </div>
             <div class="panel-body">
               <table class="table table-striped table-bordered table-list">
                 <thead>
                   <tr>
                       <th><em class="fa fa-cog"></em></th>
                       <th class="hidden-xs">ID</th>
                       <th>Name</th>
                       <th>Category</th>
                       <th>Supplier</th>
                       <th>Price</th>
                       <th>Image</th>                                                                        
                   </tr> 
                 </thead>
                 <tbody>
                         
                         <c:forEach items="${list}" var="p">
                         <tr>
                         <td>
                             <a class="btn btn-default" href="product_edit?id=${p.p_id}"><em class="fa fa-pencil"></em></a>
                             <a class="btn btn-danger" href="./product_delete?id=${p.p_id}"><em class="fa fa-trash"></em></a>
                           </td>
                           <td class="hidden-xs">${p.p_id}</td>
                           <td>${p.p_name}</td>
                           <td>${p.category.c_name}</td>     
                           <td>${p.supplier.s_name}</td>         
                           <td>${p.p_price}</td> 
                           <td><img src="${pageContext.request.contextPath}/resources/product/${p.p_image}"  class="img-rounded" alt="${p.p_name }" width="75px" height="50px"/></td>         
                           <tr>       
                         </c:forEach>
                       </tbody>
               </table>
           
             </div>
             <div class="panel-footer">
               <div class="row">
                 <div class="col col-xs-4">Page 1 of 5
                 </div>
                 <div class="col col-xs-8">
                   <ul class="pagination hidden-xs pull-right">
                     <li><a href="#">1</a></li>
                     <li><a href="#">2</a></li>
                     <li><a href="#">3</a></li>
                     <li><a href="#">4</a></li>
                     <li><a href="#">5</a></li>
                   </ul>
                   <ul class="pagination visible-xs pull-right">
                       <li><a href="#">�</a></li>
                       <li><a href="#">�</a></li>
                   </ul>
                 </div>
               </div>
             </div>
           </div>

</div></div>
	</div>
    
</body>
</html> 