<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ProductDetails</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
    <link href="./style.css" rel="stylesheet" type="text/css"  />
    <link rel="stylesheet" href="bootstrap.min.css"/>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" rel="stylesheet"/>
</head>
<body>

<div class="container">
<jsp:include page="header.jsp"></jsp:include>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div class="container-fluid">
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
			<br/>
			<br/><img id="item-display" src="./resources/images/vi.jpg" alt="" width="400" height="400"></img>
						
					
					
			
					
				<div class="col-md-7">
					<div class="product-title">Carlos Marshello CDV-500 Hand Made Designer Violin</div>
					<div class="product-desc">Carlos Marshello Violins are hand made violins made of imported and seasoned maple, spruce and ebony woods with a elegant purfled back</div>
					<div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
					<hr>
					<div class="product-price">₹25,000</div>
					<div class="product-stock">In Stock</div>
					<hr>
					<div class="btn-group cart">
						<button type="button" class="btn btn-success">
							Add to cart 
						</button>
					</div>
					<div class="btn-group wishlist">
						<button type="button" class="btn btn-danger">
							Add to wishlist 
						</button>
					</div>
				</div>
			</div> 
		</div>
		<div class="container-fluid">		
			<div class="col-md-12 product-info">
					<ul id="myTab" class="nav nav-tabs nav_tabs">
						
						<li class="active"><a href="#service-one" data-toggle="tab">DESCRIPTION</a></li>
						<li><a href="#service-two" data-toggle="tab">PRODUCT INFO</a></li>
						<li><a href="#service-three" data-toggle="tab">REVIEWS</a></li>
						
					</ul>
				<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade in active" id="service-one">
						 
							<section class="container product-info">
								Carlos Marshello Violins are hand made violins made of imported and seasoned maple, spruce and ebony woods with a elegant purfled back. The Carlos Marcello CDV Series comes with a handy imported violin case, brazil wood bow, a complete set of imported German Pirastro Strings, Pirastro Rosin Made in England and Fom shoulder rest as a complimentary.
These Violins are finely crafted by selected and gifted luthiers all over the world who are carrying on a glorious family tradition and heritage of exquisite craftmanship since generations.
		<h3> Features:</h3>
								<li>fgdfgh dfg dfgh fgh fgh fgh fgh dghj ty cvb yud vbn drtyu bj tyu h</li>
								<li>fgdfgh dfg dfgh fgh fgh fgh fgh dghj ty cvb yud vbn drtyu bj tyu h</li>
								<li>fgdfgh dfg dfgh fgh fgh fgh fgh dghj ty cvb yud vbn drtyu bj tyu h</li>
								<li>fgdfgh dfg dfgh fgh fgh fgh fgh dghj ty cvb yud vbn drtyu bj tyu h</li>
								<li>fgdfgh dfg dfgh fgh fgh fgh fgh dghj ty cvb yud vbn drtyu bj tyu h</li>
								
							</section>
										  
						</div>
					<div class="tab-pane fade" id="service-two">
						
						<section class="container">
								
						</section>
						
					</div>
					<div class="tab-pane fade" id="service-three">
												
					</div>
				</div>
				<hr>
			</div>
		</div>
	</div>
</div>
  <br/>


<jsp:include page="footer.jsp"></jsp:include>
</div>

</body>
</html>