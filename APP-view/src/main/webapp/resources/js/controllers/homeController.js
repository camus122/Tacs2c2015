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
	                   {id:1, lugar: 'La Boca', category: 'Creados'},
	                   {id:2, lugar: 'Boedo', category: 'Creados'},
	                   {id:3, lugar: 'Almagro', category: 'Creados'},
	                   {id:4, lugar: 'Caballito', category: 'Creados'}
	                   ];


	$scope.partidosInvitado = [
	                   {id:1, lugar: 'La Boca', category: 'Invitado'},
	                   {id:2, lugar: 'Boedo', category: 'Invitado'},
	                   {id:3, lugar: 'Almagro', category: 'Invitado'},
	                   {id:4, lugar: 'Caballito', category: 'Invitado'}
	                   ];

	
}