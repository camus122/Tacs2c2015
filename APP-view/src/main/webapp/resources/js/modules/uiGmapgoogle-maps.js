/**
 * Es un modulo helper que expone una api mas amigable, segun mi opinion,
 * el cual abstrae la forma de realizar una invocacion GET/POST empleando el service $resource
 * de angular. Ademas agrega un comportamiento comun, en el cual en caso de error se mostrara
 * por patalla un mensaje de error. 
 */

angular.module('myApplicationModule', ['uiGmapgoogle-maps']).config(
	    ['uiGmapGoogleMapApiProvider', function(GoogleMapApiProviders) {
	        GoogleMapApiProviders.configure({
	            china: true
	        });
	    }]
	);