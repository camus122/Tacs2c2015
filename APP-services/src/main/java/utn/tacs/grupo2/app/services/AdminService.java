package utn.tacs.grupo2.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Match;
import utn.tacs.grupo2.app.model.User;

@Controller
@RequestMapping(value = "/admin")
public class AdminService {
	
	/**
	 * punto 12 - Como administrador de la aplicacion quiero ver un panel de control indicando cantidad de partidos creados e inscriptos.

	 * @return
	 */
	@RequestMapping(value="/dashboard/matches",method=RequestMethod.GET)
	public @ResponseBody List<Match> getMatches(){
		
		List<Match> matches=new ArrayList<Match>();
		
		Match m1 = new Match();
		m1.setMaxCapacity(22);
		m1.setStartingLineupQuantity(23);
		m1.setSport("Voley");;
		matches.add(m1);
		
		Match m2 = new Match();
		m2.setMaxCapacity(22);
		m2.setStartingLineupQuantity(23);
		m2.setSport("Fulbo");;
		matches.add(m2);
		
		return matches;
	}
	
	@RequestMapping(value="/dashboard/users",method=RequestMethod.GET)
	public @ResponseBody List<User> getUsers(){
		
		User user=new User();
		user.setName("ffff");
		user.setLastName("ffff");
		User user2=new User();
		user2.setName("fff222f");
		user2.setLastName("ff333ff");
		User user3=new User();
		user3.setName("Guillermo");
		user3.setLastName("flema");		
		
		List<User> usuarios=new ArrayList<User>();
		usuarios.add(user);
		usuarios.add(user2);
		usuarios.add(user3);
		
		return usuarios;
	}

}
