//Controlador de matchTemplate
function updateMatchController($scope,$location,$routeParams,restApi){
	$scope.confirmLabel='Actualizar';
	$scope.cancelLabel='Cancelar';
	
	restApi.getCall('matches/'+$routeParams.id,{},false,function(message){
		$scope.match=message.body;
	})	
	
	$scope.successEvent=function(){
		restApi.putCall('matches',$scope.match,function(){
			$location.path('/home');	
		});
	}
	
	$scope.cancelEvent=function(){
		$location.path('/home');
	}
}