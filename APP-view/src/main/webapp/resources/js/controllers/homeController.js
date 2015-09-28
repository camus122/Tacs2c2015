//Controlador de login
function homeController($scope,$location,restApi){
	$scope.titulo='Tp tacs 2015'
	//Codigo maraviloso de login
	$scope.create=function(){
		//redirecciona a la pagina para la creacion
		$location.path('/createMatch');
	}
	
	$scope.query=function(id){
		//redirecciona a la pagina para la modificacion
		$location.path('/queryMatch/'+id);
	}
	
	$scope.update=function(id){
		//redirecciona a la pagina para la modificacion
		$location.path('/updateMatch/'+id);
	}
	
	$scope.remove=function(id){
		restApi.deleteCall('matches/'+id,{});
		//preguntar si se quiere borrar el registro
		alert('Seguro que quiere borrar el registro'); //"CREA"
	}
	
		
		
	//cambiar los partidos creados
	restApi.getCall('users/me/created/matches',{},false,function(message){
		$scope.partidosCreados=message.body;
	})
	
	$scope.partidosInvitado = [
	                           {id:0, deporte:'Futbol 32', lugar: 'Caballito', fecha: '07/10/2015',hora: '18:00'},
	    	                   {id:1, deporte:'Futbol  5', lugar: 'Caballito', fecha: '07/10/2015',hora: '18:00'},
	    	                   {id:2, deporte:'Futbol  5', lugar: 'Boedo', fecha: '07/10/2015',hora: '19:00'},
	    	                   {id:3, deporte:'Futbol 11', lugar: 'Almagro', fecha: '07/10/2015',hora: '20:00'},
	    	                   {id:4, deporte:'Futbol  7', lugar: 'Caballito', fecha: '07/10/2015',hora: '21:00'},
	    	                   ];


}