function loginController($scope,$location,restApi){
	
	$scope.loginFacebook=function(){
		//Colocar la magia de autenticacion con facebook.
		//Se tiene que hacer en AuthenticationService.java
		restApi.postCall('login',{},function(){
		//restApi.postCall('/login',$scope.match,function(){  //preguntar porque no funciona	
			//$location.path('/home'); //solo pasar al home si el facebook da el ok
			alert(123);	
		});
		
	}
}