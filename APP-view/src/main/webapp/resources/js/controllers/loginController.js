//Controlador de login
function loginController($scope,$location){
	//Codigo maraviloso de login
	
	var app_id = '909447679129341';
	var scopesF = 'email, public_profile, user_friends ';
	
	var btn_login= '<button  type="button" class="btn btn-primary" ng-click="loginFacebook()">Iniciar sesión</button>';
	
	var div_session = "<div id='facebook-session'>"+
						"<strong></strong>"+
						"<img>"+
						'<button  type="button" class="btn btn-danger" ng-click="logoutFacebook()">Cerrar sesión</button>'+
						"</div>";
	
	window.fbAsyncInit = function() {
		  FB.init({
		    appId      : app_id,
		    status	   : true,	
		    cookie     : true,  // enable cookies to allow the server to access the session
		    xfbml      : true,  // parse social plugins on this page
		    version    : 'v2.2' // use version 2.2
		  });

		   FB.getLoginStatus(function(response) {
		    statusChangeCallback(response,function(){
		    	
		    });
		  });

	};
	
	 var statusChangeCallback= function(response,callback) {
		    console.log('statusChangeCallback');
		    console.log(response);
		    
		    if (response.status === 'connected') {
		    	getFacebookData();
		    } else {//if not connected does nothing
		    	callback(false);
		    }
		  }
	
	 var checkLoginState = function(callback) {
		 FB.getLoginStatus(function(response) {
		   		callback(response);
		   	});
	}
	 
	var facebookLogin = function() {
		checkLoginState(function(data) {
		   	if (data.status !== 'connected') {
		   		FB.login(function(response) {
		   		if (response.status === 'connected')
		   			getFacebookData();
		   		}, {scope: scopes});
		   	}
	   	})
	 }
	
	var getFacebookData =  function() {
		FB.api('/me', function(response) {
			$('#login').after(div_session);
		  	$('#login').remove();
			$('#facebook-session strong').text("Bienvenido: "+response.name);
			$('#facebook-session img').attr('src','http://graph.facebook.com/'+response.id+'/picture?type=large');
		 });
	}
	
	$scope.loginFacebook=function(){
		//Colocar la magia de autenticacion con facebook.
		//redireccionar al home de la app
		facebookLogin();
		//$location.path('/home'); //solo pasar al home si el facebook da el ok
	}
}