//Controlador de login
function loginController($scope,$location){
	//Codigo maraviloso de login
	$scope.login=function(){
		//Colocar la magia de autenticacion con facebook.
		//redireccionar al home de la app
		$location.path('/home');
	}
}