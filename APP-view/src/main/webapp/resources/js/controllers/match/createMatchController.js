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
		    console.log(results[0].geometry.location); //LatLng
		    var location=results[0].geometry.location;
		    $scope.match.location.latitud=location.H;
		    $scope.match.location.longitud=location.L;
		    var center = new google.maps.LatLng($scope.match.location.latitud, $scope.match.location.longitud);
		    $scope.map.setCenter($scope.match.location);
//		    $scope.map.setZoom(8);
		});
		
	}
}