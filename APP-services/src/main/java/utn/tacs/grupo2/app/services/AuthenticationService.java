package utn.tacs.grupo2.app.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Authentication;

@Controller
public class AuthenticationService {

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public @ResponseBody String getUsers(@RequestBody  Authentication authentication){
		String token="unToken";
		return token;
	}
}
