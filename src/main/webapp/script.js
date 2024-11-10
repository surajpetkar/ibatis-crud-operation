var app = angular.module('productApp', []);
app.controller('productCtrl', function($scope, $http){
    $scope.products = [];
    $http({
        method: 'GET',
        url: "/product/all"
    }).then(function successCallback(response) {
    $scope.products = response.data;
    console.log(response.data);
    }, function errorCallback(response) {
    console.log(response);
    });
});