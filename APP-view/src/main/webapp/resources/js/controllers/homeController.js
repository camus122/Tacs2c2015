//Controlador de login
function homeController($scope,$location){
	$scope.titulo='Tp tacs 2015'
	//Codigo maraviloso de login
	$scope.create=function(){
		//redirecciona a la pagina para la creacion
		$location.path('/createMatch');
	}
	
	$scope.query=function(){
		//redirecciona a la pagina para la modificacion
		$location.path('/queryMatch');
	}
	
	$scope.update=function(){
		//redirecciona a la pagina para la modificacion
		$location.path('/updateMatch/:id');
	}
	
	$scope.deletee=function(){
		//preguntar si se quiere borrar el registro
		alert('Seguro que quiere borrar el registro'); //"CREA"
	}
	
	$scope.partidosCreados = [
	                          {id:1, deporte:'Futbol 11', lugar: 'La Boca', fecha: '07/10/2015',hora: '18:00'},
	                          {id:2, deporte:'Futbol  5', lugar: 'Boedo', fecha: '07/10/2015',hora: '19:00'},
	                          {id:3, deporte:'Futbol  5', lugar: 'Almagro', fecha: '07/10/2015',hora: '20:00'},
	                          {id:4, deporte:'Futbol  7', lugar: 'Caballito', fecha: '07/10/2015',hora: '21:00'},
	                          ];


	$scope.partidosInvitado = [
	    	                   {id:1, deporte:'Futbol  5', lugar: 'Caballito', fecha: '07/10/2015',hora: '18:00'},
	    	                   {id:2, deporte:'Futbol  5', lugar: 'Boedo', fecha: '07/10/2015',hora: '19:00'},
	    	                   {id:3, deporte:'Futbol 11', lugar: 'Almagro', fecha: '07/10/2015',hora: '20:00'},
	    	                   {id:4, deporte:'Futbol  7', lugar: 'Caballito', fecha: '07/10/2015',hora: '21:00'},
	    	                   ];


}