var app =angular.module('app',['ngRoute','ngResource','restApiModule']);


app.config(function($routeProvider, $httpProvider) {
      $routeProvider.
   	//Home
<<<<<<< HEAD
      	when('/', {controller:emptyController, templateUrl:"app/home"}).
      	when('/reservas', {controller:reservaController, templateUrl:"app/home"}).
      	when('/prueba', {controller:myController, templateUrl:"app/test"}).
//      	//Administracion
//      	//Registros
//      	when('/consultarRegistros', {controller:showRecordsController, templateUrl:'app/records'}).
//
//      	//Consulta
//      	when('/consultarRegistro/:registroId', {controller:queryRecordController, templateUrl:'app/recordTemplateStep1'}).
//      	when('/consultarRegistro_1/:registroId', {controller:queryRecordController, templateUrl:'app/recordTemplateStep1'}).
//      	when('/consultarRegistro_2/:registroId', {controller:queryRecordController, templateUrl:'app/recordTemplateStep2'}).
//      	when('/consultarRegistro_3/:registroId', {controller:queryRecordController, templateUrl:'app/recordTemplateStep3'}).
//      	when('/consultarRegistro_4/:registroId', {controller:queryRecordController, templateUrl:'app/recordTemplateStep4'}).
//      	when('/consultarRegistro_5/:registroId', {controller:queryRecordController, templateUrl:'app/recordTemplateStep5'}).      	
//      	
//      	//Modificacion
//      	when('/actualizarRegistro/:registroId', {controller:updateRecordController, templateUrl:'app/recordTemplateStep1'}).
//      	when('/actualizarRegistro_1/:registroId', {controller:updateRecordController, templateUrl:'app/recordTemplateStep1'}).
//      	when('/actualizarRegistro_2/:registroId', {controller:updateRecordController, templateUrl:'app/recordTemplateStep2'}).
//      	when('/actualizarRegistro_3/:registroId', {controller:updateRecordController, templateUrl:'app/recordTemplateStep3'}).
//      	when('/actualizarRegistro_4/:registroId', {controller:updateRecordController, templateUrl:'app/recordTemplateStep4'}).
//      	when('/actualizarRegistro_5/:registroId', {controller:updateRecordController, templateUrl:'app/recordTemplateStep5'}).      	
//      	//Creacion
//      	when('/crearRegistro_1', {controller:createRecordController, templateUrl:'app/recordTemplateStep1'}).
//      	when('/crearRegistro_2', {controller:createRecordController, templateUrl:'app/recordTemplateStep2'}).
//      	when('/crearRegistro_3', {controller:createRecordController, templateUrl:'app/recordTemplateStep3'}).
//      	when('/crearRegistro_4', {controller:createRecordController, templateUrl:'app/recordTemplateStep4'}).
//      	when('/crearRegistro_5', {controller:createRecordController, templateUrl:'app/recordTemplateStep5'}).
//     	
=======
      	when('/', {controller:loginController, templateUrl:"app/login"}).
      	when('/home', {controller:homeController, templateUrl:"app/home"}).      	
      	//Administracion
      	//Partidos
      	when('/createMatch', {controller:createMatchController, templateUrl:'app/matchTemplate'}).//Consulta
      	when('/queryMatch', {controller:queryMatchController, templateUrl:'app/matchTemplate'}).//Consulta
      	when('/updateMatch/:id', {controller:updateMatchController, templateUrl:'app/matchTemplate'}).//Modificacion
>>>>>>> b269eb3befd56b7deb8d67e7b2790b1d9da663cc
      	otherwise({redirectTo:'/'});
});

