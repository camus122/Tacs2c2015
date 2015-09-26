//Controlador de matchTemplate
function createMatchController($scope,$location,restApi){
	$scope.confirmLabel='Crear';
	$scope.cancelLabel='Cancelar';
	
	$scope.successEvent=function(){
		restApi.postCall('matches',$scope.match,function(){
			$location.path('/home');	
		});
	}
	
	$scope.cancelEvent=function(){
		$location.path('/home');
	}
}