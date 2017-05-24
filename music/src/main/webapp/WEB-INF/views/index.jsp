
<html>
<head>
	<title>Home</title>
	
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
    
   
   
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="./resources/images/m1.jpg" alt="pic1" width="800" height="300">
    </div>

    <div class="item">
      <img src="./resources/images/m2.jpg" alt="pic2" width="800" height="300">
    </div>

    <div class="item">
      <img src="./resources/images/m31.png" alt="pic3"  width="800" height="300">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<br/>
<br/>
<table class="table table-bordered table-striped">
	<tr>
		<td >
		<a href="product"><img alt="" src="./resources/images/pi.jpg" width="250" height="250" ></a>
		</td>
		<td >
		<a href=""><img alt="" src="./resources/images/vi.jpg" width="250" height="250"></a>
		</td>
		<td >
		<a href=""><img alt="" src="./resources/images/v2.jpg" width="250" height="250" ></a>
		</td>
		<td >
		<a href=""><img alt="" src="./resources/images/v3.jpg" width="250" height="250" ></a>
		</td>
		
	</tr>
</table>
<hr/>
    
    
    
 <br/>


<jsp:include page="footer.jsp"></jsp:include>
</div>


        




</body>
</html>

