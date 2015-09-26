/**
 * Es un modulo helper que expone una api mas amigable, segun mi opinion,
 * el cual abstrae la forma de realizar una invocacion GET/POST empleando el service $resource
 * de angular. Ademas agrega un comportamiento comun, en el cual en caso de error se mostrara
 * por patalla un mensaje de error. 
 */
var myModule = angular.module('restApiModule', []);
myModule.factory('restApi',  function($resource) {
	var instance={};
	instance.getCall = 
		function(restUri, requestBody, returnIsArray,successCallBack, failureCallBack) {
			var callInstance = $resource(restUri, {}, {
				query : {
					method : 'GET',
					params : requestBody,
					isArray : returnIsArray
				}
			});
			
			if(successCallBack===undefined){
				successCallBack=function(){
					//Por default no hace nada.
				}
			}			
			if(failureCallBack===undefined){
				failureCallBack=function(){
					showFailureModal();
				}
			}			
			return callInstance.query(requestBody,successCallBack,failureCallBack);
		};
		

		instance.postCall = 
			function(restUri, requestBody, successCallBack, failureCallBack) {
				var callInstance = $resource(restUri, {}, {
					query : {
						method : 'POST'
					}
				});
				if(successCallBack===undefined){
					successCallBack=function(){
						showSuccessModal();
					}
				}
				
				if(failureCallBack===undefined){
					failureCallBack=function(){
//						showFailureModal();
					}
				}
				
				return callInstance.save(requestBody,successCallBack,failureCallBack);
	}

		instance.putCall = 
			function(restUri, requestBody, successCallBack, failureCallBack) {
				var callInstance = $resource(restUri, {}, {
					update : {
						method : 'PUT'
					}
				});
				if(successCallBack===undefined){
					successCallBack=function(){
						showSuccessModal();
					}
				}
				
				if(failureCallBack===undefined){
					failureCallBack=function(){
						showFailureModal();
					}
				}
				
				return callInstance.update(requestBody,successCallBack,failureCallBack);
	}	
		
		instance.deleteCall = 
			function(restUri, requestBody, successCallBack, failureCallBack) {
				var callInstance = $resource(restUri, {}, {
					remove : {
						method : 'DELETE',
						params : requestBody,
					}
				});
				
				if(successCallBack===undefined){
					successCallBack=function(){
						//Por default no hace nada.
					}
				}			
				if(failureCallBack===undefined){
					failureCallBack=function(){
						showFailureModal();
					}
				}			
				return callInstance.remove(requestBody,successCallBack,failureCallBack);
			};	
		 	
	return instance;
});
