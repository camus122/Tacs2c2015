//Controlador de matchTemplate
function queryMatchController($scope,$location,$routeParams,restApi){
	$scope.isConsulta=true;

	restApi.getCall('matches/'+$routeParams.id,{},false,function(message){
		$scope.match=message.body;
	})
	
	$scope.back=function(){
		$location.path('/home');
	}
}