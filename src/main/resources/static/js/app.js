var app = angular.module("MyApp", []);
app.controller("MyController", function($scope, $http) {
	$scope.product=null;
	$scope.noProduct=null;
	$http.get("http://localhost:8080/products")
		.then(function(response){
		$scope.product=response.data;
		
	}),(function(response){
		$scope.noProduct = response.statusText;
			
		});
});