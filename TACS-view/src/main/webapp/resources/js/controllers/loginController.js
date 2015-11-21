
function loginController($scope,$location,restApi){
	
	
	$scope.loginFacebook=function(){
		//Colocar la magia de autenticacion con facebook.
		//Se tiene que hacer en AuthenticationService.java
		restApi.getCall('login',{},false,function(data){
			window.location.href=data.body;
		});
		
	}
}