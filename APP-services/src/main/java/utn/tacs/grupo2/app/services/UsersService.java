package utn.tacs.grupo2.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Match;
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

	/**
	 * punto 4 - Como usuario quiero poder ver el estado de mis partidos creados (inscriptos titulares y suplentes)

	 * @return
	 */
	@RequestMapping(value="/me/created/matches",method=RequestMethod.GET)
	public @ResponseBody List<Match> myMatches(){
		List<Match> matches=new ArrayList<Match>();
		Match m1 = new Match();
		m1.setMaxCapacity(22);
		m1.setStartingLineupQuantity(23);
		m1.setSport("Voley");;
		matches.add(m1);
		return matches; 
	}
	
	/**
	 * punto 5 - Como usuario quiero poder ver aquellos partidos en los que me anoté.
	 * @return
	 */
	@RequestMapping(value="/me/joined/matches",method=RequestMethod.GET)
	public @ResponseBody List<Match> joinMatches(){
		List<Match> matches=new ArrayList<Match>();
		Match m1 = new Match();
		m1.setMaxCapacity(22);
		m1.setStartingLineupQuantity(23);
		m1.setSport("Voley");;
		matches.add(m1);
		return matches; 
	}	

	
	/**
	 * Tiene como objetivo conocer los partidos also caules se anoto un amigo
	 * @param friendId
	 * @return
	 */
	@Deprecated
	@RequestMapping(value="/{friendId}/created/matches",method=RequestMethod.GET)
	public @ResponseBody List<Match> friendMatches(@PathVariable("friendId") String friendId){
		List<Match> matches=new ArrayList<Match>();
		Match m1 = new Match();
		m1.setMaxCapacity(22);
		m1.setStartingLineupQuantity(11);
		m1.setSport("Deporte-Amigo");
		Match m2 = new Match();
		m2.setMaxCapacity(22);
		m2.setSport("Furbol");	
		m2.setStartingLineupQuantity(45);
		matches.add(m1);
		matches.add(m2);
		return matches; 
	}	
	
	/**
	 * punto 3 -  Como usuario quiero poder anotarme en un partido creado por un amigo.
	 * Como titular en caso de que no se haya llegado al cupo solicitado , y sino como suplente.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/joined/{matchFriendId}",method=RequestMethod.POST)
	public @ResponseBody String join(@PathVariable("matchFriendId") String matchFriendId){
		return "asignado-"+matchFriendId;
	}
	
	/**
	 * punto 6 - Como usuario quiero recomendar a un amigo un partido que creé para que pueda anotarse.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/{myMatchId}/notify/{friendId}",method=RequestMethod.POST)
	public @ResponseBody String notifyFriend(@PathVariable("myMatchId") String myMatchId,@PathVariable("friendId") String friendId){
		return "notificando-"+myMatchId+" a "+friendId;
	}	
	
	
}
