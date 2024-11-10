<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Products</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='style.css'>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"> </script>
    <script src='script.js'></script>
</head>
<body ng-app="productApp" ng-controller="productCtrl">
    <div class="wrap" ng-repeat="product in products">
		<div class="card">
			<img src="" alt="Product Image" style="width: 100%">
				<div class="container">
                    <h3><b>{{product.productName}}</b></h3>
                    <div class="quantityBlock"> 
                        <span>Ratings</span>
                        <span>{{product.productQuantity}}</span>
                    </div>
                    <div class="priceBlock">
                        <b><span>&#8377;{{product.productPrice}}</span></b>
                        <del><span>&#8377;599</span></del>
                        <span class="percent">50% off</span>
                    </div>
                </div>
		</div>
    </div>
</body>
</html>