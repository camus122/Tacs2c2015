//Este controller da acceso de scope a las directivas que lo requieren pero que no emplean un
//control del mismo.
function emptyController($scope,$rootScope){
	
	$scope.mostrar=function(){
		alert($scope.email);
	}
}