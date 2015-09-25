var app =angular.module('app',['ngRoute','ngResource','restApiModule','ngMap']);


app.config(function($routeProvider, $httpProvider) {
      $routeProvider.
   	//Home
      	when('/', {controller:loginController, templateUrl:"app/login"}).
      	when('/home', {controller:homeController, templateUrl:"app/home"}).      	
      	//Administracion
      	//Partidos
      	when('/createMatch', {controller:createMatchController, templateUrl:'app/matchTemplate'}).//Consulta
      	when('/queryMatch', {controller:queryMatchController, templateUrl:'app/matchTemplate'}).//Consulta
      	when('/updateMatch/:id', {controller:updateMatchController, templateUrl:'app/matchTemplate'}).//Modificacion
      	otherwise({redirectTo:'/'});
});

