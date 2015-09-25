//Controlador de matchTemplate
function createMatchController($scope,$location){
	$scope.titulo='Crear Partido';
	
	$scope.map = { center: { latitude: 45, longitude: -73 }, zoom: 8 };
	
	//esta funcion deberia, guardar en nuevo partido pero no funciona 
	$scope.Save=function(){
		$scope.partidosCreados.push({Deporte:$scope.nuevoPartido.deporte});
	}
	
	
	$scope.successEvent=function(){
		//accion del submit
		alert('crear'); //"CREA"
		
		//redirige
		//la ruta valida cuando se redirige son las definidas en app.js  el primer parametro.
		$location.path('/home');
	}
}