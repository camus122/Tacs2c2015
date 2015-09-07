package utn.tacs.grupo2.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.User;

@Controller
@RequestMapping(value = "/users")
public class UsersService {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers(){
		User user=new User();
		user.setName("ffff");
		user.setLastName("ffff");
		User user2=new User();
		user2.setName("ffff");
		user2.setLastName("ffff");
		List<User> usuarios=new ArrayList<User>();
		usuarios.add(user);
		usuarios.add(user2);
		return usuarios;
	}
}
