function showFailureModal(){
	alert('Error');
}

function showSuccessModal(){
	alert('Exitoso');
}

//GoogleMapUtils

function moveMarkCenter(mapInstance,location){
    var center = new google.maps.LatLng(location.latitud, location.longitud);
    mapInstance.panTo(center);
    mapInstance.setCenter(center);
    mapInstance.setZoom(17);
    var marker = new google.maps.Marker({
        position: center,
        map: mapInstance,
        title: location.address
      });
}

