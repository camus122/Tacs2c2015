package utn.tacs.grupo2.app.services;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Match;
import utn.tacs.grupo2.app.model.Message;
import utn.tacs.grupo2.app.util.ObjectMemoryRepository;

@Controller
@RequestMapping(value = "/matches")
public class MatchServices {
	
	//Permite generar ids, para la memoria volatil.
	private static int ID=0;
	
	/*
	 * Punto2 - Como usuario quiero poder crear un partido de un deporte. En la creacion se indicara el deporte que se jugara y cuantas personas son necesarias
	 */
	
	/**
	 * creacion
	 * @param match
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Message createMatch(@RequestBody  Match match){
		match.setId(""+ID++);
		ObjectMemoryRepository.getMatches().add(match);
		return new Message("id-"+match.getSport()+"-"+match.getMaxCapacity());
	}
	
	/**
	 * modificacion
	 * @param match
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Message updateMatch(@RequestBody  Match match){
		List<Match> matches = ObjectMemoryRepository.getMatches();
		int index=matches.indexOf(match);
		matches.remove(index);
		matches.add(match);
		return new Message("update-"+match.getSport()+"-"+match.getMaxCapacity());
	}	
	
	/**
	 * recuperar partido
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{matchId}",method = RequestMethod.GET)
	public @ResponseBody Message getMatch(@PathVariable("matchId") String id){
		List<Match> matches = ObjectMemoryRepository.getMatches();
		for(Match match:matches){
			if(id.equals(match.getId())){
				return new Message(match);
			}
		}
		throw new IllegalStateException("Si llego aca es porque no encontro y esot no deberia pasar.");
	}
	
	/**
	 * borrar
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{matchId}",method = RequestMethod.DELETE)
	public @ResponseBody Message deleteMatch(@PathVariable("matchId") String id){
		List<Match> matches = ObjectMemoryRepository.getMatches();
		boolean remove=false;
		int index=0;
		for(Match match:matches){
			if(id.equals(match.getId())){
				remove=true;
				break;
			}
			index++;
		}
		if(remove){
			matches.remove(index);
		}else{
			throw new IllegalStateException("Si llego aca es porque no encontro y esot no deberia pasar.");	
		}
		return new Message("delete-"+id);
	}	

}
