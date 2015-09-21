//Este controller da acceso de scope a las directivas que lo requieren pero que no emplean un
//control del mismo.
function reservaController($scope,$rootScope,restApi){
	$scope.deboMostrar=false;
	$scope.email='soy2Reserva'
		
	$scope.map = { center: { latitude: 45, longitude: -73 }, zoom: 8 };
	
	$scope.mostrar=function(){
		restApi.getCall('users',{},true,function(data){
			$scope.informacion=data;
		})
		
	}
	
}