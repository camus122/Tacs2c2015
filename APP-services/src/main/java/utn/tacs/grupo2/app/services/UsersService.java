package utn.tacs.grupo2.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Match;
import utn.tacs.grupo2.app.model.Message;
import utn.tacs.grupo2.app.model.User;
import utn.tacs.grupo2.app.util.ObjectMemoryRepository;

@Controller
@RequestMapping(value = "/users")
public class UsersService {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers(){
		return ObjectMemoryRepository.getUsers();
	}

	/**
	 * punto 4 - Como usuario quiero poder ver el estado de mis partidos creados (inscriptos titulares y suplentes)
	 * 
	 * Esta funcion, carga en la lista de Partidos creados, sus correspondientes parametros.
	 * @return
	 */
	@RequestMapping(value="/me/created/matches",method=RequestMethod.GET)
	public @ResponseBody Message myMatches(){
		List<Match> matches = ObjectMemoryRepository.getMatches();
		return new Message(matches);
	}
	
	/**
	 * punto 5 - Como usuario quiero poder ver aquellos partidos en los que me anoto.
	 * @return
	 */
	@RequestMapping(value="/me/joined/matches",method=RequestMethod.GET)
	public @ResponseBody Message joinMatches(){
		//Falta agregar la logica donde se filtra por los partidos que me anote
		return new Message(ObjectMemoryRepository.getMatches()); 
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
		ObjectMemoryRepository.getFriendMatches();//User el id para obtener el match
		Match friendMatch=null;//Aca se guardaria el match de tu amigo
		ObjectMemoryRepository.getMatches().add(friendMatch);//Una vesz hecho se agregaa tu lista
		return "asignado-"+matchFriendId;
	}
	
	/**
	 * punto 6 - Como usuario quiero recomendar a un amigo un partido que creo para que pueda anotarse.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/{myMatchId}/notify/{friendId}",method=RequestMethod.POST)
	public @ResponseBody String notifyFriend(@PathVariable("myMatchId") String myMatchId,@PathVariable("friendId") String friendId){
		//Posiblente esto quede del lado del cliente porque se notifica por facebook.
		return "notificando-"+myMatchId+" a "+friendId;
	}
	
	/**
	 * punto 7 - Como usuario quiero ver los partidos que me recomendaron, y anotarme o rechazarlos.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/me/recommended/matches",method=RequestMethod.GET)
	public @ResponseBody Message recommendedMatches(){
			return new Message(ObjectMemoryRepository.getRecomendedMatches());
	}
	
	/**
	 * punto 11 - Como usuario que se anoto en un partido quiero poder borrarme del mismo.
	 * @param matchFriendId
	 * @return
	 */
	@RequestMapping(value="/unsubscribe/{myMatchId}",method=RequestMethod.DELETE)
	public @ResponseBody String unsubscibe(@PathVariable("myMatchId") String myMatchId){
		@SuppressWarnings("unused")
		List<Match> myMatches=(List<Match>) joinMatches().getBody();
		//iterar y borrarel dato
		return "Se borro del partido-"+myMatchId;
	}
	
	
}
