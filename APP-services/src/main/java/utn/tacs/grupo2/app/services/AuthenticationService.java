package utn.tacs.grupo2.app.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Message;
import facebook4j.Facebook;
import facebook4j.FacebookFactory;

@Controller
public class AuthenticationService {

	/**
	 * 1- Como usuario quiero poder registrarme con mi cuenta de Facebook.
	 * @param authentication
	 * @return
	 */
	
//	private static String appID ="919315624824573";
//	private static String appSecret ="9c333498da18838103d606cace91b84d";
//	private static String accessToken ="919315624824573|GNX6lVS8VzoecWTeXhnya-24gV0";
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public @ResponseBody Message loginFacebook(HttpServletRequest request, HttpServletResponse response){
        Facebook facebook = new FacebookFactory().getInstance();
        request.getSession().setAttribute("facebook", facebook);
        StringBuffer callbackURL = request.getRequestURL();
        int index = callbackURL.lastIndexOf("/");
        callbackURL.replace(index, callbackURL.length(), "").append("/callback");
       	return new Message(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
	}
	
	@RequestMapping(value="/callback" ,method = RequestMethod.GET)
	public String loginFacebookCallback(HttpServletRequest request, HttpServletResponse response){
        Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
        String oauthCode = request.getParameter("code");
        try {
            facebook.getOAuthAccessToken(oauthCode);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        return "redirect:/#/home";
	}
}
