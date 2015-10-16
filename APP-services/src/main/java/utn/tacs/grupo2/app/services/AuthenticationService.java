package utn.tacs.grupo2.app.services;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.User;
import facebook4j.auth.AccessToken;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Authentication;

@Controller
@RequestMapping(value = "/login")
public class AuthenticationService {

	/**
	 * 1- Como usuario quiero poder registrarme con mi cuenta de Facebook.
	 * @param authentication
	 * @return
	 */
	
	private static String appID ="909447679129341";
	private static String appSecret ="fdda66dac48941f0c5fe5e4fe7e0a99f";
	private static String accessToken ="909447679129341|Mw3_jie53Kz1W9yBdbZxkZRrYQU";
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String loginFacebook(@RequestBody  Authentication authentication){
		
		
		
		//se establece la conexion con Facebook
		Facebook facebook = new FacebookFactory().getInstance();
		facebook.setOAuthAppId(appID, appSecret);
		//facebook.setOAuthPermissions(commaSeparetedPermissions);
		facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
		
		
		//se usa la api
		try {
			User user=facebook.getMe();
			System.out.println("Mi nombre:");
			System.out.println(user.getName());
		} catch (FacebookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String token="unToken";
		return token;
	}
}
