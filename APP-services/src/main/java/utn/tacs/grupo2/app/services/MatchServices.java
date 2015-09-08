package utn.tacs.grupo2.app.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import utn.tacs.grupo2.app.model.Match;

@Controller
@RequestMapping(value = "/matches")
public class MatchServices {
	
	/*
	 * Punto2 - Como usuario quiero poder crear un partido de un deporte. En la creación se indicará el deporte que se jugará y cuantas personas son necesarias
	 */
	
	/**
	 * creacion
	 * @param match
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String createMatch(@RequestBody  Match match){
		System.out.println("match.sport: "+match.getSport()+" for "+match.getMaxCapacity());
		return "id-"+match.getSport()+"-"+match.getMaxCapacity();
	}
	
	/**
	 * modificacion
	 * @param match
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody String updateMatch(@RequestBody  Match match){
		return "update-"+match.getSport()+"-"+match.getMaxCapacity();
	}	
	
	/**
	 * recuperar partido
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{matchId}",method = RequestMethod.GET)
	public @ResponseBody String getMatch(@PathVariable("matchId") String id){
		return "get-"+id;
	}
	
	/**
	 * borrar
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{matchId}",method = RequestMethod.DELETE)
	public @ResponseBody String deleteMatch(@PathVariable("matchId") String id){
		return "delete-"+id;
	}	

}
