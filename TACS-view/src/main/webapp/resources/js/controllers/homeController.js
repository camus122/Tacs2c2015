//Controlador de login
function homeController($scope,$location,restApi){
	$scope.titulo='Tp tacs 2015'
	
	restApi.getCall('users/me/info',{},false,function(data){
		$scope.user=data.body;		
	})
		
	cargarAnotados();
	cargarRecomendados();
	
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
	
	$scope.removeAnotado=function(id){
		restApi.deleteCall('matches/'+id,{},cargarAnotados);
	}
	
	$scope.removeRecomendado=function(id){
		restApi.deleteCall('matches/recommended/'+id,{},cargarRecomendados);
	}	

	function cargarAnotados(){
		//cambiar los partidos creados
		restApi.getCall('users/me/joined/matches',{},false,function(message){
			$scope.partidosAnotados=message.body;
		});
	}
	
	function cargarRecomendados(){
		//cambiar los partidos creados
		restApi.getCall('users/me/recommended/matches',{},false,function(message){
			$scope.partidosRecomendados=message.body;
		})	
	}
}