//Controlador de login
function homeController($scope,$location){
	$scope.titulo='SoyElHome'
	//Codigo maraviloso de login
	$scope.create=function(){
		//redirecciona a la pagina para la creacion
		$location.path('/createMatch');
	}
}