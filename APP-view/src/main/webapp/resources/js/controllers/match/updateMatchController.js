//Controlador de matchTemplate
function updateMatchController($scope,$location){
	$scope.titulo='Modificar partido.';
	$scope.successEvent=function(){
		//accion del submit
		alert('modificacion')
		//redirige la ruta valida cuando se redirige son las definidas en app.js  el primer parametro.
		$location.path('/home');
	}
}