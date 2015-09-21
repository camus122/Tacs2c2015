//Controlador de matchTemplate
function createMatchController($scope,$location){
	$scope.titulo='Estoy en createMatchController';
	$scope.successEvent=function(){
		//accion del submit
		alert('crear'); //"CREA"
		//redirige
		//la ruta valida cuando se redirige son las definidas en app.js  el primer parametro.
		$location.path('/home');
	}
}