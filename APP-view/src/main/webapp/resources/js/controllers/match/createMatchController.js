//Controlador de matchTemplate
function createMatchController($scope,$location,restApi){
	$scope.confirmLabel='Crear';
	$scope.cancelLabel='Cancelar';
	
	$scope.centerMap='current-location';
	
	$scope.successEvent=function(){
		restApi.postCall('matches',$scope.match,function(){
			$location.path('/home');	
		});
	}
	
	$scope.cancelEvent=function(){
		$location.path('/home');
	}
	
	$scope.searchLocation=function(address){
		var geocoder = new google.maps.Geocoder();
		geocoder.geocode({
		    "address": address
		}, function(results) {
		    var coordinates=results[0].geometry.location;
		    $scope.match.location.latitud=coordinates.H;
		    $scope.match.location.longitud=coordinates.L;
		    moveMarkCenter($scope.map,$scope.match.location)
		});
		
	}
	
}