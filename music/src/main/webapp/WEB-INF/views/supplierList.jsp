<!DOCTYPE html>
<!-- <html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"> -->
	<html>
	 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="utf-8" />
	<title>Supplierddd</title>
	<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
	<script src="./resources/js/jquery.min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="./resources/css/jquery.dataTables.min.css">
	<link href="./resources/font-awesome.min.css" rel='stylesheet' type='text/css'>

</head>

<body>
<jsp:include page="header.jsp"/>
<br/>
<div style="float: right;">
<a style="color:black" href="<c:url value="add"/>" >ADD</a></li>|<a href="productList">View Products</a>|<a href="categoryList">View Categories</a>|<a href="supplierList">View Suppliers</a>
</div>
<br/>
<div class="container">
<div class="row">
   
   <p></p>
   <h1>Supplier List</h1>   
   <p> </p><p> </p>
   
       <div class="col-md-10 col-md-offset-1">

           <div class="panel panel-default panel-table">
             <div class="panel-heading">
               <div class="row">
                 <div class="col col-xs-6">
                   <h3 class="panel-title">Category Data Table</h3>
                 </div>
                
               </div>
             </div>
             <div class="panel-body">
               <table class="table table-striped table-bordered table-list">
                 <thead>
                   <tr>
                      
                       <th class="hidden-xs">ID</th>
                       <th>Name</th>
                                                                                         
                   </tr> 
                 </thead>
                 <tbody>
                         
                         <c:forEach items="${list}" var="s">
                         <tr>
                        
                           <td class="hidden-xs">${s.s_id}</td>
                           <td>${s.s_name}</td>
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