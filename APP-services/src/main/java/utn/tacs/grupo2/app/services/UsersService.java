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
		m1.setSport("Lololol");;
		matches.add(m1);
		return matches; 
	}
	
	/**
	 * punto 5 - Como usuario quiero poder ver aquellos partidos en los que me anot�.
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
	 * Tiene como objetivo conocer los partidos a los cuales se anoto un amigo
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
	@RequestMapping(value="/join/{matchFriendId}",method=RequestMethod.POST)
	public @ResponseBody String join(@PathVariable("matchFriendId") String matchFriendId){
		return "asignado-"+matchFriendId;
	}
	
	/**
	 * punto 6 - Como usuario quiero recomendar a un amigo un partido que cre� para que pueda anotarse.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/{myMatchId}/notify/{friendId}",method=RequestMethod.POST)
	public @ResponseBody String notifyFriend(@PathVariable("myMatchId") String myMatchId,@PathVariable("friendId") String friendId){
		return "notificando-"+myMatchId+" a "+friendId;
	}
	
	/**
	 * punto 7 - Como usuario quiero ver los partidos que me recomendaron, y anotarme o rechazarlos.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/me/recommended/matches",method=RequestMethod.GET)
	public @ResponseBody List<Match> recommendedMatches(){
		
		User user=new User();
		user.setName("Juan");
		user.setLastName("Poncho");
		User user2=new User();
		user2.setName("Pancho");
		user2.setLastName("Suarez");
		User user3=new User();
		user3.setName("Guillermo");
		user3.setLastName("Pepon");
		User user4=new User();
		user4.setName("Hideo");
		user4.setLastName("Kojima");
		User user5=new User();
		user5.setName("Troy");
		user5.setLastName("Baker");
		
		List<Match> matches=new ArrayList<Match>();
		
		Match m1 = new Match();
		m1.setMaxCapacity(22);
		m1.setStartingLineupQuantity(23);
		m1.setSport("Voley");;
		m1.addUser(user4);
		m1.addUser(user5);
		m1.addUser(user);
		matches.add(m1);
		
		Match m2 = new Match();
		m2.setMaxCapacity(22);
		m2.setStartingLineupQuantity(23);
		m2.setSport("Fulbo");;
		m2.addUser(user2);
		m2.addUser(user3);
		m2.addUser(user4);
		matches.add(m2);
		
		return matches;
	}
	
	/**
	 * punto 11 - Como usuario que se anot� en un partido quiero poder borrarme del mismo.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/unsubscribe/{myMatchId}",method=RequestMethod.DELETE)
	public @ResponseBody String unsubscibe(@PathVariable("myMatchId") String myMatchId){
		return "Se borr� del partido-"+myMatchId;
	}
	
	
}
