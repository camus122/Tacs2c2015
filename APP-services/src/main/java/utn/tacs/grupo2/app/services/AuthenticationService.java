package utn.tacs.grupo2.app.services;

//import facebook4j.Facebook;
//import facebook4j.FacebookException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Authentication;

@Controller
public class AuthenticationService {

	/**
	 * 1- Como usuario quiero poder registrarme con mi cuenta de Facebook.
	 * @param authentication
	 * @return
	 */
	
//	private static String appID ="1";
//	private static String appSecret ="1";
//	private static String accessToken ="1";
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public @ResponseBody String loginFacebook(@RequestBody  Authentication authentication){
		
		
		
		//se establece la conexión con Facebook
		//Facebook facebook = new FacebookFactory().getInstance();
		//facebook.setOAuthAppId(appID, appSecret);
		//facebook.setOAuthPermissions(commaSeparetedPermissions);
		//facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
		
		
		//se usa la api
		//User user=facebook.getMe();
		
		
		String token="unToken";
		return token;
	}
}
