//Controlador de matchTemplate
function queryMatchController($scope,$location){
	$scope.titulo='Consulda del Partido';	
	$scope.successEvent=function(){
		//accion del submit
		alert('consulta');
		//redirige la ruta valida cuando se redirige son las definidas en app.js  el primer parametro.
		$location.path('/home');
	}
}